/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scripts;

/**
 *
 * @author moham
 */
class GameObject {
    public static Transform transform;
    GameObject(Object GetComponent) {
        
    }

    Object GetComponent(Rigidbody rigidbody) {
        return new Object();
    }

    void AddForce(Vector3 Mul, float Impulse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void setForward(Vector3 forward) {
        transform.forward = forward;
    }

    void SetParent(Collision objectWeHit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static class transform {

        static Vector3 forward;

        public static void setForward(Vector3 forward) {
            transform.forward = forward;
        }
        
        public transform() {
        }
    }
    
}
