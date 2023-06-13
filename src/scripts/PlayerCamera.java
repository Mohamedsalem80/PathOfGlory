package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;
import Unity.Events;

public class PlayerCamera extends MonoBehaviour {
    public float mousesensitivity = 0f;
    float yrotaion = 0f;
    float x;
    // Start is called before the first frame update
    void Start()
    {

        Cursor.lockState = CursorLockMode.Locked;
    }

    // Update is called once per frame
    void Update()
    {
        float mousex = Input.GetAxis("Mouse X") * mousesensitivity * Time.deltaTime;
        yrotaion += mousex;
        transform.localRotation = Quaternion.Euler(x, yrotaion, 0f);
    }
}