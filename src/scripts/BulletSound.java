package scripts;

import System.Collections;
import Unity.Engine;

public class BulletSound extends MonoBehaviour
{
    public float clipLength = 1f;
    public GameObject audioClipObject;

    // Update is called once per frame
    void Update()
    {
        if (Input.GetMouseButtonDown(0))
        {
            audioClipObject.SetActive(true);
            PlaySoundWithDelay();
        }
    }

    void PlaySoundWithDelay()
    {
        StartCoroutine(DelayedSoundDeactivation());
        // start coroutine is used to pause the method to do any time based function the resume the paused method
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
