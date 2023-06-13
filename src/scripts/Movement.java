package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;

public class Movement extends MonoBehaviour{
   // Animator animator;
    private CharacterController controller;
    public float normalSpeed = 12f;
    public float slowSpeed = 4f;
    public float gravity = -9.81f * 200;
    public float jumpHeight = 3f;
    public Transform groundCheck;
    public float groundDistance = 0.4f;
    public LayerMask groundMask;
    Vector3 velocity;
    boolean isGrounded;
    boolean isMoving;
    public Vector3 lastPosition = new Vector3(0f, 0f, 0f);
    boolean isSlowed;

    // Start is called before the first frame update
    void Start()
    {
       controller = (CharacterController) GetComponent(new CharacterController());
      //  animator = GetComponent<Animator>();
    }

    // Update is called once per frame
    void Update()
    {
        isGrounded = Physics.CheckSphere(groundCheck.position, groundDistance, groundMask);
        if (isGrounded && velocity.y < 0)
        {
            velocity.y = -2f;
        }

        float x = Input.GetAxis("Horizontal");
        float z = Input.GetAxis("Vertical");
        Vector3 move = new Vector3(transform.right * x + transform.forward * z);

        if (Input.GetKeyDown(KeyCode.LeftShift))
        {
            isSlowed = true;
        }
        else if (Input.GetKeyUp(KeyCode.LeftShift))
        {
            isSlowed = false;
        }

        if (isSlowed)
        {
            controller.Move(move.Mul(slowSpeed).Mul(Time.deltaTime));
        }
        else
        {
            controller.Move(move.Mul(normalSpeed).Mul(Time.deltaTime));
        }

        if (Input.GetButtonDown("Jump") && isGrounded)
        {
            velocity.y = Mathf.Sqrt(jumpHeight * -2f * gravity);
        }

        velocity.y += gravity * Time.deltaTime ;
        controller.Move(velocity.Mul(Time.deltaTime));

        if (!lastPosition.equals(gameObject.transform.position) && isGrounded)
        {
            isMoving = true;
        }
        else
        {
            isMoving = false;
        }
        lastPosition = new Vector3(gameObject.transform.position);
    }
}