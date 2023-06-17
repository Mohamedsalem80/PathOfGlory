package scripts;

import System.Collections;
import Unity.Engine;
import Unity.TMPro;


public class respawn22 extends MonoBehaviour {
    public float threshold = 0f;
    private CharacterController controller;
    public int currentHealth;
    public boolean died = false;
    private Transform respawnPoint;
    public int counter2=0,c2=0;
    boolean flag2=false;
    public TextMeshProUGUI cont2;
    void Start()
    {
        controller = (CharacterController) GetComponent(new CharacterController());
    }

    void Update()
    {
        died = false;

        currentHealth =(int) ((Health) GetComponent(new Health())).health;
        if (currentHealth <= threshold)
        {
            counter2++;
            if(counter2>0)
            {
                flag2 = true;
            }
            StartCoroutine(MoveToRespawnPointWithDelay());
        }
        cont2.setText(String.valueOf(c2));
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
        if (flag2)
        {
            c2++;
            flag2 = false;
        }
        return new WaitForSeconds(3f); // Delay for 3 seconds
    }

    private void StartCoroutine(IEnumerator MoveToRespawnPointWithDelay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
