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
public class Persona_matriculada {
    
    private Integer id;
    private Persona persona;
    private String matricula, partido, localidad;

    public Persona_matriculada(Integer id, Persona persona, String matricula, String partido, String localidad) {
        this.id = id;
        this.persona = persona;
        this.matricula = matricula;
        this.partido = partido;
        this.localidad = localidad;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    
}
