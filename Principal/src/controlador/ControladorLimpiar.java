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
import visual.Login;

/**
 *
 * @author Diego
 */
public class ControladorLimpiar implements MouseListener{

     private DaoControlador daoLogin = new DaoControlador();
    private JTextField usuarioLogin;
    private JTextField claveLogin;
    
      public ControladorLimpiar(JTextField usuarioLogin, JTextField claveLogin) {
        this.usuarioLogin = usuarioLogin;
        this.claveLogin = claveLogin;
      }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        usuarioLogin.setText(null);
        claveLogin.setText(null);
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
