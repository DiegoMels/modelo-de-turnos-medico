/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.ControladorCancelar;
import controlador.ControladorWindows;
import controlador.ControladorRegistrar;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Registrarse extends JFrame {
    
     private JButton aceptar = new JButton("Aceptar");
    private JButton cancelar = new JButton("Cancelar");
    private JLabel lblNombre = new JLabel("Nombre");
    private JLabel lblApellido = new JLabel("Apellido");
    private JTextField txtNombre = new JTextField("");
    private JTextField txtApellido = new JTextField("");
    private GridLayout contenedor =  new GridLayout(4,2);
    private ControladorRegistrar controladorRegistrar = new ControladorRegistrar();
    private ControladorWindows controladorWindows = new ControladorWindows();
    private ControladorCancelar controladorCancelar = new ControladorCancelar();
    
    
    public Registrarse(){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("Login");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        this.cancelar.addMouseListener(controladorCancelar);
        this.addWindowListener(controladorWindows);
    }
    
    public void agregarComponentes(){
        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblApellido);
        this.add(txtApellido);
        this.add(cancelar);

        
    }
    
    
}
