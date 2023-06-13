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
class Vector3 {
    public static float x;
    public static float y;
    public static float z; 
            
    Vector3(float f, float f0, float f1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Vector3(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Vector3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Vector3 Mul(double f){
        return this;
    }
    public boolean equals(double f){
        return f == this.y;
    }
    
}
