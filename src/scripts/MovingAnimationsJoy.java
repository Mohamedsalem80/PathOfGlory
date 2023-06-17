package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;


public class MovingAnimationsJoy extends MonoBehaviour {

    Animator animator;
    boolean isCrouch = false;
    void Start()
    {
        animator = (Animator) GetComponent(new Animator());
    }
    boolean forwardPressed = false;
    boolean backwardPressed = false;
    boolean stopWalking = false;
    boolean jumpCheck = false;
    boolean rightStep = false;
    boolean leftCheck = false;
    boolean crouchCheck = false;
    void Update()
    {
        float horizontalAxis = Input.GetAxis("Horizontal");
        float verticalAxis = Input.GetAxis("Vertical");
        stopWalking = Input.GetKey(KeyCode.Joystick1Button3);
        jumpCheck = Input.GetKey(KeyCode.Joystick1Button2);
        crouchCheck = Input.GetKey(KeyCode.Joystick1Button1);
        boolean die = ((respawn22) GetComponent(new respawn22())).died;
        if (die)
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
            animator.SetBool("respawn", true);
            animator.SetBool("newgame", false);
        }
        else
        {
            animator.SetBool("newgame", true);
            animator.SetBool("respawn", false);
            if (horizontalAxis > 0)
            {
                rightStep = true;
                leftCheck = false;
            }
            else if (horizontalAxis < 0)
            {
                rightStep = false;
                leftCheck = true;
            }
            else
            {
                rightStep = false;
                leftCheck = false;
            }

            if (verticalAxis > 0)
            {
                forwardPressed = true;
                backwardPressed = false;
            }
            else if (verticalAxis < 0)
            {
                forwardPressed = false;
                backwardPressed = true;
            }
            else
            {
                forwardPressed = false;
                backwardPressed = false;
            }



            if (!isCrouch)
            {
                if (forwardPressed)
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
                }
                else if (backwardPressed)
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
                    animator.SetInteger("CrouchValues", 0);
                    forwardPressed = false;
                }
                else if (stopWalking)
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
                }
                else if (jumpCheck)
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
                }
                else if (rightStep)
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
                    animator.SetInteger("CrouchValues", 0);
                }
                else if (leftCheck)
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
                    animator.SetInteger("CrouchValues", 0);
                }
                else if (Input.GetKeyDown(KeyCode.Joystick1Button7))
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
                    animator.SetBool("Crouch", true);
                    animator.SetInteger("CrouchValues", 0);
                    isCrouch = true;
                }
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
                    animator.SetInteger("CrouchValues", 1);
                }
                else if (backwardPressed)
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
                    animator.SetInteger("CrouchValues", 5);
                    isCrouch = false;
                }
            }

        }
    }
}