package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Engine;

public class GlobalReferences extends MonoBehaviour {
    public static GlobalReferences instance;
    public GameObject bulletImpactEffectPrefab;
    private void Awake()
    {
        if(instance != null && instance != this)
        {
            Destroy(bulletImpactEffectPrefab);
        }
        else
        {
            instance = this;
        }
    }

    private void Destroy(GameObject bulletImpactEffectPrefab) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

