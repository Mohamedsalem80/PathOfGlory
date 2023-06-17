package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;
import Unity.Events;

public class InputManager3 extends MonoBehaviour {
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
        //float mousex = Input.GetAxis("MouseY") * mousesensitivity * Time.deltaTime;
        float mousey = Input.GetAxis("MouseX") * mousesensitivity * Time.deltaTime;
        xrotaion -= mousey;
        xrotaion = Mathf.Clamp(xrotaion, uplimits, downlimits);
        //yrotaion += mousex;
        transform.localRotation = Quaternion.Euler(xrotaion, yrotaion, 0f);
    }
}