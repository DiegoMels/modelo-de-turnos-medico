/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import visual.Login;
import visual.Registrarse;

/**
 *
 * @author Diego
 */
public class ControladorRegistrar implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent me) {
        
        Registrarse JFrame = new Registrarse();
        JFrame.setVisible(true);
  
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
