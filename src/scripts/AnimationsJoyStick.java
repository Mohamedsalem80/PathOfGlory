package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;

public class AnimationsJoyStick extends MonoBehaviour {
    // Start is called before the first frame update
    Animator animator;
    boolean isKnee = false;
    boolean isCrouch = false;
    void Start()
    {
        animator = (Animator) GetComponent(new Animator());
    }
    // Update is called once per frame
    void Update()
    {
        //0 forward right stick
        //2 right stick right
        //3 right stick left
        //7 R2
        //l1 4
        //
        boolean x = Input.GetButtonDown("up");
        boolean forwardPressed = Input.GetButtonDown("up");
        boolean BackWardPressed = Input.GetKey(KeyCode.Joystick1Button1);
        boolean StopWAlking = Input.GetKey(KeyCode.Joystick1Button5);
        boolean JumpCheck = Input.GetKey(KeyCode.Joystick1Button6);
        boolean rightStep = Input.GetKey(KeyCode.Joystick1Button7);
        boolean leftCheck = Input.GetKey(KeyCode.Joystick1Button8);
        boolean kneeCheck = Input.GetKey(KeyCode.Joystick1Button9);
        boolean crouchCheck = Input.GetKey(KeyCode.Joystick1Button10);
        //bool iswalking = animator.GetBool("isWalking");
        if (forwardPressed && !isCrouch)// && !iswalking)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", true);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            animator.SetInteger("CrouchValues", 0);
            // isKnee = false;
        }
        else if (BackWardPressed && !isCrouch)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", true);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            // isCrouch = false;
            animator.SetInteger("CrouchValues", 0);
            //  isKnee = false;
        }
        else if (StopWAlking)
        {
            animator.SetBool("Stop", true);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            isCrouch = false;
            animator.SetInteger("CrouchValues", 0);
            //  isKnee = false;
        }
        else if (JumpCheck)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", true);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            isCrouch = false;
            animator.SetInteger("CrouchValues", 0);
            //  isKnee = false;
        }
        else if (Input.GetKeyDown(KeyCode.LeftShift))
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", true);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            isCrouch = false;
            animator.SetInteger("CrouchValues", 0);
            //  isKnee = false;
        }
        else if (rightStep && !isCrouch)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", true);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            //  isCrouch = false;
            animator.SetInteger("CrouchValues", 0);
            //  isKnee = false;
        }
        else if (leftCheck && !isCrouch)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", true);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            //isCrouch = false; //   isKnee = false;
            animator.SetInteger("CrouchValues", 0);
        }
        if (kneeCheck && !isKnee)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", true);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            animator.SetInteger("CrouchValues", 0);
            isKnee = true;
            isCrouch = false;

        }
        else if (kneeCheck && isKnee)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", false);
            animator.SetBool("ForwardCrouch", false);
            animator.SetInteger("CrouchValues", 0);
            isKnee = false;
            isCrouch = false;
        }
        else if (crouchCheck && !isCrouch)
        {
            animator.SetBool("Stop", false);
            animator.SetBool("MoveBack", false);
            animator.SetBool("isWalking", false);
            animator.SetBool("Jump", false);
            animator.SetBool("Run", false);
            animator.SetBool("Right", false);
            animator.SetBool("Left", false);
            animator.SetBool("Knee", false);
            animator.SetBool("Crouch", true);
            //  animator.SetBool("ForwardCrouch", false);
            animator.SetInteger("CrouchValues", 0);
            isCrouch = true;

        }
        else if (isCrouch)
        {
            if (forwardPressed)
            {
                animator.SetBool("Stop", false);
                animator.SetBool("MoveBack", false);
                animator.SetBool("isWalking", false);
                animator.SetBool("Jump", false);
                animator.SetBool("Run", false);
                animator.SetBool("Right", false);
                animator.SetBool("Left", false);
                animator.SetBool("Knee", false);
                animator.SetBool("Crouch", false);
                // animator.SetBool("ForwardCrouch", true);
                animator.SetInteger("CrouchValues", 1);
            }
            else if (BackWardPressed)
            {
                animator.SetBool("Stop", false);
                animator.SetBool("MoveBack", false);
                animator.SetBool("isWalking", false);
                animator.SetBool("Jump", false);
                animator.SetBool("Run", false);
                animator.SetBool("Right", false);
                animator.SetBool("Left", false);
                animator.SetBool("Knee", false);
                animator.SetBool("Crouch", false);
                //animator.SetBool("ForwardCrouch", true);
                animator.SetInteger("CrouchValues", 4);
            }
            else if (rightStep)
            {
                animator.SetBool("Stop", false);
                animator.SetBool("MoveBack", false);
                animator.SetBool("isWalking", false);
                animator.SetBool("Jump", false);
                animator.SetBool("Run", false);
                animator.SetBool("Right", false);
                animator.SetBool("Left", false);
                animator.SetBool("Knee", false);
                animator.SetBool("Crouch", false);
                //  animator.SetBool("ForwardCrouch", true);
                animator.SetInteger("CrouchValues", 2);
            }
            else if (leftCheck)
            {
                animator.SetBool("Stop", false);
                animator.SetBool("MoveBack", false);
                animator.SetBool("isWalking", false);
                animator.SetBool("Jump", false);
                animator.SetBool("Run", false);
                animator.SetBool("Right", false);
                animator.SetBool("Left", false);
                animator.SetBool("Knee", false);
                animator.SetBool("Crouch", false);
                //  animator.SetBool("ForwardCrouch", true);
                animator.SetInteger("CrouchValues", 3);
            }
            else if (crouchCheck)
            {
                animator.SetBool("Stop", false);
                animator.SetBool("MoveBack", false);
                animator.SetBool("isWalking", false);
                animator.SetBool("Jump", false);
                animator.SetBool("Run", false);
                animator.SetBool("Right", false);
                animator.SetBool("Left", false);
                animator.SetBool("Knee", false);
                animator.SetBool("Crouch", false);
                //  animator.SetBool("ForwardCrouch", true);
                animator.SetInteger("CrouchValues", 5);
                isCrouch = false;
            }
        }
        /*if (iswalking && !forwardPressed)
        {
            animator.SetBool("isWalking", false);
        }*/
    }
}
