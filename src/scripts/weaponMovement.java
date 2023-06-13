package scripts;

import Unity.Engine;

public class weaponMovement extends MonoBehaviour {
    public Transform weapon;
    public float moveDistance = 1f;

    private boolean isWeaponDown = false;
    private Vector3 originalPosition;

    private void Start()
    {
        originalPosition = weapon.localPosition;
    }

    private void Update()
    {
        if (Input.GetKeyDown(KeyCode.C))
        {
            if (isWeaponDown)
                MoveWeaponUp();
            else
                MoveWeaponDown();
        }
    }

    private void MoveWeaponDown()
    {
        Vector3 newPosition = originalPosition.sub(new Vector3(0f, moveDistance, 0f));
        weapon.localPosition = newPosition;
        isWeaponDown = true;
    }

    private void MoveWeaponUp()
    {
        weapon.localPosition = originalPosition;
        isWeaponDown = false;
    }
}
