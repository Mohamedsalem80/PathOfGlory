package scripts;

import System.Collections;
import Unity.Engine;

public class respawn22 extends MonoBehaviour
{
    public float threshold = 0f;
    private CharacterController controller;
    public int currentHealth;
    public boolean died = false;
    private Transform respawnPoint;

    void Start()
    {
        controller = (CharacterController) GetComponent(new CharacterController());
    }

    void Update()
    {
        died = false;

        currentHealth = (int) ((Health) GetComponent(new Health())).health;
        if (currentHealth <= threshold)
        {
            StartCoroutine(MoveToRespawnPointWithDelay());
        }
    }

    IEnumerator MoveToRespawnPointWithDelay()
    {
        died = true;
        


        Vector3 respawnPosition = new Vector3(this.respawnPoint.position);
        controller.enabled = false; // Disable character controller to teleport instantly
        transform.position = respawnPosition; // Teleport the character to the respawn point
        controller.enabled = true; // Enable character controller after teleportation

        died = false;

        currentHealth = 100;
        ((Health) GetComponent(new Health())).health = 100;
        return new WaitForSeconds(3f); // Delay for 3 seconds
    }

    private void StartCoroutine(IEnumerator MoveToRespawnPointWithDelay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

