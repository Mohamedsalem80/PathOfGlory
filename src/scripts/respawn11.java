package scripts;

import System.Collections;
import System.ComponentModel.Design.Serialization;
import Unity.TMPro;
import Unity.Engine;
import UnityEditor.Experimental.AssetDatabaseExperimental.AssetDatabaseCounters;

public class respawn11 extends MonoBehaviour {
    public float threshold = 0f;
    private CharacterController controller;
    public int currentHealth;
    public boolean died = false;
    private Transform respawnPoint;
    public int counter1 = 0,c=0;
    public TextMeshProUGUI cont;
    public boolean flag=false;
    void Start()
    {
        controller = (CharacterController) GetComponent(new CharacterController());
    }

    void Update()
    {
        died = false;
        currentHealth = (int)((Health) GetComponent(new Health())).health;
        if (currentHealth <= threshold)
        {
            counter1++;
            if(counter1>0)
            {
                flag = true;
            }
            currentHealth = 100;
            StartCoroutine(MoveToRespawnPointWithDelay());
        }
        cont.setText(String.valueOf(c));
    }

    IEnumerator MoveToRespawnPointWithDelay()
    {
        died = true;

        Vector3 respawnPosition = respawnPoint.position;
        controller.enabled = false; // Disable character controller to teleport instantly
        transform.position = respawnPosition; // Teleport the character to the respawn point
        controller.enabled = true; // Enable character controller after teleportation

        died = false;
      
        currentHealth = 100;
        ((Health) GetComponent(new Health())).health = 100;
        if(flag)
        {
            c++;
            flag = false;
        }
        //flag = false;
        return new WaitForSeconds(3f); // Delay for 3 seconds
    }

    private void StartCoroutine(IEnumerator MoveToRespawnPointWithDelay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
