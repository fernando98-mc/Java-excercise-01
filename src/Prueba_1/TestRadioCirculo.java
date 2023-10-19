/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba_1;

import java.util.Scanner;

/**
 *
 * @author Userr
 */
public class TestRadioCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputKeyBo = new Scanner(System.in);
        double PI = 3.1416;
        System.out.println("ingresa el radio del circulo");
        double radio = inputKeyBo.nextDouble();
        double resultado = (PI*radio)*2;
        System.out.println("El radio de circulo es " + resultado);
    }
    
}
