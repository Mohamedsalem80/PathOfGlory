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
        if(objectWeHit.gameObject.CompareTag("Target"))
        {
            print(" !" + objectWeHit.gameObject.name + "hit ");
            CreateBulletImpactEffect(objectWeHit);
            Destroy(gameObject);
        } else {
        }
        if (objectWeHit.gameObject.CompareTag("Wall"))
        {
            print("hit " + objectWeHit.gameObject.name + " !");
            CreateBulletImpactEffect(objectWeHit);
            Destroy(gameObject);
        }
        if(objectWeHit.gameObject.CompareTag("Beer"))
        {
            print("hit a beer bottle");
            objectWeHit.gameObject.GetComponent(new BeerBottle()).Shatter();
        }
        if (objectWeHit.gameObject.CompareTag("Player"))
        {
            print("hit a player");
            objectWeHit.gameObject.GetComponent<Health>().health-=10;
            Destroy(gameObject);
        }
        void CreateBulletImpactEffect(Collision objectWeHit)
        {
            ContactPoint contact = objectWeHit.contacts[0];
            GameObject hole = Instantiate(
                GlobalReferences.instance.bulletImpactEffectPrefab,
                contact.point,
                Quaternion.LookRotation(contact.normal)
                );
            hole.transform.SetParent(objectWeHit.gameObject.transform);
        }
    }

    private void print(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CreateBulletImpactEffect(Collision objectWeHit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
