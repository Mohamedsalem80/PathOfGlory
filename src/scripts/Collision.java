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
class Collision {

    String name;
    ContactPoint[] contacts;
    static Transform transform;
    
    boolean CompareTag(String target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object GetComponent(Health h) {
        return new Object();
    }

    static class gameObject {

        static String name;

        static boolean CompareTag(String target) {
            return true;
        }

        static Object GetComponent(BeerBottle beerBottle) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public gameObject() {
        }
    }
    
}
