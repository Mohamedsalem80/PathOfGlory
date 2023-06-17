package scripts;

import System.Collections;
import System.Collections.Generic;
import Unity.Mathematics;
import Unity.Engine;
import scripts.MonoBehaviour.gameObject;

public class Bullet extends MonoBehaviour
{
    private void OnCollisionEnter(Collision objectWeHit)
    {
        if(objectWeHit.CompareTag("Target"))
        {
            print(" !" + objectWeHit.name + "hit ");
            CreateBulletImpactEffect(objectWeHit);
            Destroy(objectWeHit);
        } else {
            if (objectWeHit.CompareTag("Wall"))
            {
                print("hit " + objectWeHit.name + " !");
                CreateBulletImpactEffect(objectWeHit);
                Destroy(objectWeHit);
            }
            if (objectWeHit.CompareTag("Player"))
            {
                print("hit a player");
                ((Health) objectWeHit.GetComponent(new Health())).health-=10;
                Destroy(objectWeHit);
            }
        }
    }
    
    void CreateBulletImpactEffect(Collision objectWeHit) {
            ContactPoint contact = objectWeHit.contacts[0];
            GameObject hole = Instantiate(
                GlobalReferences.instance.bulletImpactEffectPrefab,
                contact.point,
                Quaternion.LookRotation(contact.normal)
                );
            hole.SetParent(objectWeHit);
        }

    private void print(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Destroy(Collision objectWeHit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private GameObject Instantiate(GameObject bulletImpactEffectPrefab, float point, float LookRotation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
