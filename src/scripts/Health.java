package scripts;


import System.Collections;
import System.Collections.Generic;
import System.ComponentModel.Design.Serialization;
import Unity.Engine;
import Unity.TMPro;

public class Health extends MonoBehaviour {

    public double health = 100;
    public TextMeshProUGUI heal;
     void Update()
    {
        if(health<100 && health>0)
        {
            health += 0.05;
        }
        heal.setText(String.valueOf((int)health));
    }
}