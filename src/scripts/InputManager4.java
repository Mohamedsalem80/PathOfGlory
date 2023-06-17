package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;
import Unity.Events;

public class InputManager4 extends MonoBehaviour {
    public float mousesensitivity = 500f;
    float xrotaion = 0f;
    float yrotaion = 0f;
    float uplimits = -30f;
    float downlimits = 30f;
    // Start is called before the first frame update
    void Start()
    {

        Cursor.lockState = CursorLockMode.Locked;
    }

    // Update is called once per frame
    void Update()
    {
        float mousey = Input.GetAxis("Mouse Y") * mousesensitivity * Time.deltaTime;// ger y dimensions
        xrotaion -= mousey; // - sign to make if we moved the mouse up the camera moves down and vice verse
        xrotaion = Mathf.Clamp(xrotaion, uplimits, downlimits); // to make limits for the looking up and same for down
     //y rotation doesn't need limits as the player can rotate 360 degree normally 
        transform.localRotation = Quaternion.Euler(xrotaion, yrotaion, 0f);// Euler Equation
    }
}