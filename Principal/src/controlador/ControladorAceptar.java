/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.DaoControlador;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class ControladorAceptar implements MouseListener {
    
     private DaoControlador daoLogin = new DaoControlador();
    private JTextField usuarioLogin;
    private JTextField claveLogin;

    public ControladorAceptar(JTextField usuarioLogin, JTextField claveLogin) {
        this.usuarioLogin = usuarioLogin;
        this.claveLogin = claveLogin;
    }


    @Override
    public void mouseClicked(MouseEvent me) {
         if(usuarioLogin.getText().equals(daoLogin.getUsuario()) && claveLogin.getText().equals(daoLogin.getClave())){
            System.out.println("Correcto");
            
        }else{
            System.out.println("NO Correcto");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}
