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
public class Persona_paciente {
    
    private Integer id;
    private Persona persona;
    private Obra_social obra_social;

    public Persona_paciente(Integer id, Persona persona, Obra_social obra_social) {
        this.id = id;
        this.persona = persona;
        this.obra_social = obra_social;
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

    public Obra_social getObra_social() {
        return obra_social;
    }

    public void setObra_social(Obra_social obra_social) {
        this.obra_social = obra_social;
    }
    
    
    
}
