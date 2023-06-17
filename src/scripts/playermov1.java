package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;

public class playermov1 extends MonoBehaviour {
    private CharacterController controller;
    public float speed = 12f;
    public float gravity = -9.81f * 2;
    public float jumpheight = 3f;
    public Transform groundcheck;
    public float groundDistance = 0.4f;
    public LayerMask groundMask;
    Vector3 velocity;
    boolean isGrounded;
    boolean isMoving;
    public Vector3 lastPosition = new Vector3(0f, 0f, 0f);

    // Start is called before the first frame update
    void Start()
    {
        controller = (CharacterController) GetComponent(new CharacterController());
    }

    // Update is called once per frame
    void Update()
    {
        isGrounded = Physics.CheckSphere(groundcheck.position, groundDistance, groundMask);
        if (isGrounded && velocity.y < 0)
        {
            velocity.y = -2f;
        }
        float x = Input.GetAxis("Horizontalk");
        float z = Input.GetAxis("Verticalk");
        x *= (-1);
        Vector3 move = new Vector3(transform.right * x + transform.forward * z);
        controller.Move(move.Mul(speed).Mul(Time.deltaTime));
        if (Input.GetKeyDown(KeyCode.Space) && isGrounded)
        {
            velocity.y = Mathf.Sqrt(jumpheight * -2f * gravity);
        }
        velocity.y += gravity * Time.deltaTime;
        controller.Move(velocity.Mul(Time.deltaTime));
        if (!(lastPosition.equals(gameObject.transform.position)) && isGrounded == true)
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
