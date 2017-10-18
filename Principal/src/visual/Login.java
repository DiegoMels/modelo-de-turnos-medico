/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import controlador.ControladorAceptar;
import controlador.ControladorCancelar;
import controlador.ControladorWindows;
import controlador.ControladorRegistrar;
import controlador.ControladorLimpiar;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Login extends JFrame {
    
    private JButton aceptar = new JButton("Aceptar");
    private JButton cancelar = new JButton("Cancelar");
    private JButton registrarse = new JButton("Registrarse");
    private JButton limpiar = new JButton("Limpiar");
    private JLabel lblUsuario = new JLabel("Usuario");
    private JLabel lblClave = new JLabel("Clave");
    private JTextField txtUsuario = new JTextField("");
    private JTextField txtClave = new JTextField("");
    private GridLayout contenedor =  new GridLayout(4,2);
    private ControladorWindows controladorWindows = new ControladorWindows(); 
    private ControladorAceptar controladorAceptar = new ControladorAceptar(txtUsuario, txtClave);
    private ControladorCancelar controladorCancelar = new ControladorCancelar();
    private ControladorRegistrar controladorRegistrar = new ControladorRegistrar();
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(txtUsuario, txtClave);
    
    
    public Login(){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("Login");
        this.setLocation(200, 200);
        this.setSize(400, 200);
        this.setVisible(true);
        this.aceptar.addMouseListener(controladorAceptar);
        this.cancelar.addMouseListener(controladorCancelar);
        this.registrarse.addMouseListener(controladorRegistrar);
        this.limpiar.addMouseListener(controladorLimpiar);
        this.addWindowListener(controladorWindows);
    }
    
    public void agregarComponentes(){
        this.add(lblUsuario);
        this.add(txtUsuario);
        this.add(lblClave);
        this.add(txtClave);
        this.add(aceptar);
        this.add(cancelar);
        this.add(registrarse);
        this.add(limpiar);
        
    }
   
}
