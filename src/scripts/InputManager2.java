package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;
import Unity.Events;

public class InputManager2 extends MonoBehaviour {
    public float mousesensitivity = 0f;
    float xrotaion = 0f;
    float yrotaion = 0f;
    // Start is called before the first frame update
    void Start()
    {

        Cursor.lockState = CursorLockMode.Locked;
    }

    // Update is called once per frame
    void Update()
    {
        //float mousex = Input.GetAxis("Mouse X") * mousesensitivity * Time.deltaTime;
        float mousey = Input.GetAxis("Mouse Y") * mousesensitivity * Time.deltaTime;
        xrotaion -= mousey;
        xrotaion = Mathf.Clamp(xrotaion, -90f, 90f);
        //yrotaion += mousex;
        transform.localRotation = Quaternion.Euler(xrotaion, yrotaion, 0f);
    }
}
