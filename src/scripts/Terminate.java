package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;

public class Terminate extends MonoBehaviour {
    void Update()
    {
        boolean quit=Input.GetKey(KeyCode.Escape);
        if (quit)
        {
            QuitGame();
        }
    }
    public void QuitGame()
    {
        Application.Quit();
    }
}
