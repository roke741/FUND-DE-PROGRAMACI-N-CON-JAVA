
package com.mycompany.demo01;

import com.mycompany.demo01.ui.EscuelaLogin;

/**
 *
 * @author Jhordie
 */
public class Demo01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EscuelaLogin login = new EscuelaLogin();
        login.setSize(300, 500);
        login.setLocation(450, 150);
        login.setVisible(true);
    }
}
