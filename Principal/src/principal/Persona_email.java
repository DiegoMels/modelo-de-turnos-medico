/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Diego
 */
public class Persona_email {
    
    private Integer id;
    private Persona persona;
    private String email;
    private Tipo_email tipoEmail;

    public Persona_email(Integer id, Persona persona, String email, Tipo_email tipoEmail) {
        this.id = id;
        this.persona = persona;
        this.email = email;
        this.tipoEmail = tipoEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Tipo_email getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(Tipo_email tipoEmail) {
        this.tipoEmail = tipoEmail;
    }
    
    
    
}
