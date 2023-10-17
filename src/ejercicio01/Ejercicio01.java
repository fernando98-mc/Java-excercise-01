/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Userr
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char asientos[][] = new char[10][10];
        Scanner tecla = new Scanner(System.in);
        boolean status = false;
        String respuesta;
        int fila, asiento;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

        System.out.println("====== Bienvenidos al sistemas de ventas de asientos ======");
        while (status != true) {
            System.out.println("Ingrese la fila y asiento");
            
            System.out.println("La fila debe ser entre 0 y 8");
            fila = tecla.nextInt();
            
            System.out.println("El asiento debes ser entre 0 y 9");
            asiento = tecla.nextInt();
            
            if(asientos[fila][asiento]=='L'){
                asientos[fila][asiento]='X';
                System.out.println("El asiento fue reservado!");
            } else {
                System.out.println("El asiento se encuentra ocupado");
            }
            
            System.out.println("¿Desea continuar con la busqueda de asientos? S/N");
            respuesta = tecla.next();
            
            if(respuesta.equalsIgnoreCase("S")){
                status=true;
            }
        }
    }

}
