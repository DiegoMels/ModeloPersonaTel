/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princip;

/**
 *
 * @author alumno
 */
public class Princip {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tipo_tel tipo_tel = new Tipo_tel(1, "Home");
        Persona_tel persona_tel = new Persona_tel(null, 1, "4444-4444", tipo_tel);

        
    }
    
}
