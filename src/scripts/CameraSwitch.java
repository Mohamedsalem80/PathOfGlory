package scripts;
import System.Collections;
import System.Collections.Generic;
import Unity.Engine;

public class CameraSwitch extends MonoBehaviour {
    public Camera firstCamera;
    public Camera secondCamera;
    public Camera ThirdCamera;
    public Camera FourthCamera;
    
    private boolean ActiveFirst = true;
    boolean isCrouch;
    
    void Start()
    {
        firstCamera.enabled = true;
        secondCamera.enabled = false;
        ThirdCamera.enabled = false;
        FourthCamera.enabled = false;
    }
    
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.V))
        {
        } else {
            if (ActiveFirst == true)
            {
                if (firstCamera.enabled)
                {
                    ActiveFirst = false;
                    firstCamera.enabled = false;
                    secondCamera.enabled = true;
                    ThirdCamera.enabled = false;
                    FourthCamera.enabled = false;
                }
                else if(ThirdCamera.enabled)
                {
                    ActiveFirst = false;
                    firstCamera.enabled = false;
                    secondCamera.enabled = false;
                    ThirdCamera.enabled = false;
                    FourthCamera.enabled = true;
                }
            }
            else
            {
                if(secondCamera.enabled==true)
                {
                    ActiveFirst = true;
                    firstCamera.enabled = true;
                    secondCamera.enabled = false;
                    ThirdCamera.enabled = false;
                    FourthCamera.enabled = false;
                }
                else if(FourthCamera.enabled==true)
                {
                    ActiveFirst = true;
                    firstCamera.enabled = false;
                    secondCamera.enabled = false;
                    ThirdCamera.enabled = true;
                    FourthCamera.enabled = false;
                }
                
            }
        }
        if((Input.GetKeyDown(KeyCode.X)) && !isCrouch)
        {
            isCrouch = true;
            if (firstCamera.enabled)
            {
                firstCamera.enabled = false;
                secondCamera.enabled = false;
                ThirdCamera.enabled = true;
                FourthCamera.enabled = false;
            }
            else if (secondCamera.enabled)
            {
                firstCamera.enabled = false;
                secondCamera.enabled = false;
                ThirdCamera.enabled = false;
                FourthCamera.enabled = true;
            }
            else if (ThirdCamera.enabled)
            {
                firstCamera.enabled = true;
                secondCamera.enabled = false;
                ThirdCamera.enabled = false;
                FourthCamera.enabled = false;
            }
            else if (FourthCamera.enabled)
            {
                firstCamera.enabled = false;
                secondCamera.enabled = true;
                ThirdCamera.enabled = false;
                FourthCamera.enabled = false;
            }
        }
        else if(Input.GetKeyDown(KeyCode.X) && isCrouch)
        {
            isCrouch = false;
            if (firstCamera.enabled)
            {
                firstCamera.enabled = false;
                secondCamera.enabled = false;
                ThirdCamera.enabled = true;
                FourthCamera.enabled = false;
            }
            else if (secondCamera.enabled)
            {
                firstCamera.enabled = false;
                secondCamera.enabled = false;
                ThirdCamera.enabled = false;
                FourthCamera.enabled = true;
            }
            else if (ThirdCamera.enabled)
            {
                firstCamera.enabled = true;
                secondCamera.enabled = false;
                ThirdCamera.enabled = false;
                FourthCamera.enabled = false;
            }
            else if (FourthCamera.enabled)
            {
                firstCamera.enabled = false;
                secondCamera.enabled = true;
                ThirdCamera.enabled = false;
                FourthCamera.enabled = false;
            }
        }
    }
}