/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Userr
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner name = new Scanner(System.in);
        //System.out.println("Ingresa tu nombre");
        String name = JOptionPane.showInputDialog(null, "Ingrea tu nombre");
        //String inputName = name.next();        
        JOptionPane.showMessageDialog(null, "Tu nombre es " + name);
        //System.out.println("Hola ..." .concat(inputName));
    }
    
}
