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
public class Tipo_tel {
    
    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   public Tipo_tel(Integer id, String nombre) {
       
       this.id = id;
       this.nombre = nombre;
       
   }
}
