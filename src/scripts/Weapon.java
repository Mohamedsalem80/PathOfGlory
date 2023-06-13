package scripts;

import System.Collections;
import System.Collections.Generic;
import System.Runtime.CompilerServices;
import Unity.VisualScripting;
import Unity.Engine;
//using UnityEngine.Windows;

public class Weapon extends MonoBehaviour {
    public Camera playerCamera;
    public boolean isShooting, readyToShoot;
    boolean allowReset = true;
    public float shootingDelay = 2f;
    public int bulletsPerBurst = 3;
    public int burstBulletsLeft;
    public float spreadIntensity;

    private GameObject Instantiate(GameObject bulletprefab, eulerAngles position, float identity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Invoke(String resetShot, float shootingDelay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Destroy(GameObject bullet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void StartCoroutine(IEnumerator DestroyBulletAfterTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum ShootingMode
    {
        single,
        Burst,
        Auto
    }
    public ShootingMode currentShootingmode;
    public GameObject bulletprefab;
    public Transform bulletspawn;
    public float bulletvelocity= 30;
    public float bulletprefablifetime= 3f;
    private void Awake()
    {
        readyToShoot = true;
        burstBulletsLeft = bulletsPerBurst;
    }

    // Update is called once per frame
    void Update()
    {
        if(currentShootingmode == ShootingMode.Auto)
            {
                isShooting = Input.GetKey(KeyCode.Mouse0);
            }
        else if(currentShootingmode == ShootingMode.Burst || currentShootingmode == ShootingMode.single)
            {
                isShooting = Input.GetKeyDown(KeyCode.Mouse0);
            }
        if (readyToShoot && isShooting)
        {
            burstBulletsLeft = bulletsPerBurst;
            FireWeapon();
        }
    }
    private void FireWeapon()
    {
        readyToShoot = false;
        Vector3 shootingDirection = CalculateDirectionAndSpread().normalized;
        GameObject bullet = Instantiate(bulletprefab, bulletspawn.position, Quaternion.identity);
        bullet.setForward(shootingDirection);
        new GameObject(bullet.GetComponent(new Rigidbody())).AddForce(shootingDirection.Mul(bulletvelocity), ForceMode.Impulse);
        StartCoroutine(DestroyBulletAfterTime(bullet, bulletprefablifetime));
        if(allowReset)
        {
            Invoke("ResetShot", shootingDelay);
            allowReset = false;
        }
        if(currentShootingmode == ShootingMode.Burst && burstBulletsLeft > 1)
        {
            burstBulletsLeft--;
            Invoke("FireWeapon", shootingDelay);
        }
    }
    private void ResetShot()
    {
        readyToShoot = true;
        allowReset = true;
    }
    public Vector3 CalculateDirectionAndSpread()
    {
        Ray ray = playerCamera.ViewportPointToRay(new Vector3(0.5f, 0.5f, 0));
        RaycastHit hit = null;
        Vector3 targetpoint;
        if (Physics.Raycast(ray, hit))
        {
            targetpoint = hit.point;
        }
        else
        {
            targetpoint = ray.GetPoint(100);
        }
        Vector3 direction = new Vector3(targetpoint.sub(bulletspawn.position));
        float x = UnityEngine.Random.Range(-spreadIntensity, spreadIntensity);
        float y = UnityEngine.Random.Range(-spreadIntensity, spreadIntensity);
        return direction.add(new Vector3(x, y, 0));
    }
    private IEnumerator DestroyBulletAfterTime(GameObject bullet, float bulletprefablifetime)
    {
        Destroy(bullet);
        return new WaitForSeconds(bulletprefablifetime);
    }
}
