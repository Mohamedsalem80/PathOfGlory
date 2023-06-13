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
class Input {

    static float GetAxis(String mouse_X) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean GetKeyUp(int LeftShift) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean GetButtonDown(String jump) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean GetKey(int W) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Input() {
    }
    
    public static boolean GetKeyDown(int p){
        return (p == 32); 
    }
}
