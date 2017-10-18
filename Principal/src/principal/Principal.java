/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import visual.Login;
/**
 *
 * @author Diego
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Login login = new Login();
                
        Tipo_telefono tipo_telefono = new Tipo_telefono(1, "Casa");
        Persona_telefono persona_telefono = new Persona_telefono(1, null, "4444-4444", tipo_telefono);
        Tipo_email tipo_email = new Tipo_email (1, "Trabajo");
        Persona_email persona_email = new Persona_email (1, null, "email@hotmail.com", tipo_email);
        Persona_genero persona_genero = new Persona_genero(1, "Hombre");
        Persona_matriculada persona_matriculada = new Persona_matriculada (1, null, "Enfermero", "Moron", "castelar" );
        Obra_social obra_social = new Obra_social (1, "(Nombre de la obra social)");
        Persona_paciente persona_paciente = new Persona_paciente (1, null, obra_social);
        Localidad localidad = new Localidad (1, "Castelar", "Moron");
        Partido partido = new Partido (1, "Moron", localidad);
        Provincia provincia = new Provincia (1, "Buenos Aires", partido);
        Pais pais = new Pais (1, "Argentina", provincia);
        
        
        
    }
    
}
