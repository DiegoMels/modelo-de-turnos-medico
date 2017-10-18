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
public class Persona {
    
    private Integer dni, altura;
    private String nombre, apellido, clave, genero, localidad, nacionalidad, calle, piso_dpto;
    private Persona_telefono telefono;
    private Persona_email email;
   
    public Persona(Integer dni, Integer altura, String nombre, String apellido, String clave, String genero, Persona_telefono telefono, Persona_email email, String localidad, String nacionalidad, String calle, String piso_dpto, Persona_telefono[] Persona_telefono, Persona_email[] Persona_email) {
        this.dni = dni;
        this.altura = altura;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.genero = genero;
        this.telefono = telefono;
        this.email = email;
        this.localidad = localidad;
        this.nacionalidad = nacionalidad;
        this.calle = calle;
        this.piso_dpto = piso_dpto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Persona_telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Persona_telefono telefono) {
        this.telefono = telefono;
    }

    public Persona_email getEmail() {
        return email;
    }

    public void setEmail(Persona_email email) {
        this.email = email;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPiso_dpto() {
        return piso_dpto;
    }

    public void setPiso_dpto(String piso_dpto) {
        this.piso_dpto = piso_dpto;
    }
    
    
    
}
