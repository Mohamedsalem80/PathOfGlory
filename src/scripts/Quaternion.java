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
class Quaternion {
    public static float identity;
    static float LookRotation(float f){
        return f;
    }
    static double Euler(float xrotaion, float yrotaion, float f) {
        return (xrotaion + yrotaion)* f;
    }
    
}
