package com.factug.factugo;

import com.factug.factugo.ui.FrmLogin;
import com.factug.factugo.ui.Splashscreen;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.UIManager;
/**
 *
 * @author Jhordie
 */
public class FactuGo {

    public static void main(String[] args) {
        System.out.println("Bienvenido a FactuGO");
        
        Runnable nRun = () -> {
            Splashscreen spc = new Splashscreen();
            
            spc.setVisible(true);
           

            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FactuGo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            spc.dispose();
            
            FrmLogin fLogin = new FrmLogin();
            Shape forma = new RoundRectangle2D.Double(0, 0, fLogin.getBounds().width, fLogin.getBounds().height, 30, 30);
            fLogin.setShape(forma);
            fLogin.setVisible(true);
        };
        
        
        Thread miHiloSplash = new Thread(nRun);
        miHiloSplash.start();
 
    }
}            
