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
public class Persona_tel {
    private Persona persona;
    private Integer id;
    private String tel;
    private Tipo_tel tipoTel;

    public Persona_tel(Persona persona, Integer id, String tel, Tipo_tel tipoTel) {
        this.persona = persona;
        this.id = id;
        this.tel = tel;
        this.tipoTel = tipoTel;
    }

    
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Tipo_tel getTipoTel() {
        return tipoTel;
    }

    public void setTipoTel(Tipo_tel tipoTel) {
        this.tipoTel = tipoTel;
    }
    
    
    
}
