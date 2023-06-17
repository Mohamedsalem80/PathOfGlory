package scripts;

import System.Collections;
import Unity.Engine;

public class BulletSound2 extends MonoBehaviour {
    public float clipLength = 1f;
    public GameObject audioClipObject;

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKey(KeyCode.Joystick1Button5))
        {
            audioClipObject.SetActive(true);
            PlaySoundWithDelay();
        }
    }

    void PlaySoundWithDelay()
    {
        StartCoroutine(DelayedSoundDeactivation());
    }

    IEnumerator DelayedSoundDeactivation()
    {
        audioClipObject.SetActive(false);
        return new WaitForSeconds(clipLength);
    }

    private void StartCoroutine(IEnumerator DelayedSoundDeactivation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
