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
public class Persona_telefono {
    
    private Persona persona;
    private Integer id;
    private String telefono;
    private Tipo_telefono tipoTelefono;

    public Persona_telefono(Integer id, Persona persona, String telefono, Tipo_telefono tipoTelefono) {
        this.persona = persona;
        this.id = id;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Tipo_telefono getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(Tipo_telefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    
    
    
}
