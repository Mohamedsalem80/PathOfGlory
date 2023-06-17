package scripts;


import System.Collections;
import System.Collections.Generic;
import System.ComponentModel.Design.Serialization;
import Unity.Engine;
import Unity.TMPro;
import Unity.UI;

public class Health extends MonoBehaviour {

    public Image barImage;
    public double health = 100;
    public TextMeshProUGUI heal;

    void Update()
    {
        if (health < 100 && health > 0)
        {
            health += 0.05;
        }
        heal.setText(String.valueOf((int)health));
        UpdateHealthbar();
    }

    void UpdateHealthbar()
    {
        barImage.fillAmount = (float)(health / 100);
    }
}

