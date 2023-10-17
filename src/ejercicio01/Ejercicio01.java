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
        String respuesta, viewMap;
        int fila = 0, asiento = 0;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

        System.out.println("====== Bienvenidos al sistemas de ventas de asientos ======");
        while (status != true) {

            System.out.println("¿Desea ver los asientos disponibles? S/N");
            viewMap = tecla.next();
            if (viewMap.equalsIgnoreCase("S")) {
                dibujarMapa(asientos);
            }

            boolean reservar = false;
            while (reservar != true) {
                System.out.println("Ingrese la fila y asiento");

                System.out.println("La fila debe ser entre 0 y 8");
                fila = tecla.nextInt();

                System.out.println("El asiento debes ser entre 0 y 9");
                asiento = tecla.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        reservar = true;
                    } else {
                        System.out.println("El numero de asiento es error");
                    }
                } else {
                    System.out.println("El numero de fila es error");
                }
            }

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado!");
            } else {
                System.out.println("El asiento se encuentra ocupado");
            }

            System.out.println("¿Desea continuar con la busqueda de asientos? S/N");
            respuesta = tecla.next();

            if (respuesta.equalsIgnoreCase("N")) {
                status = true;
            }
        }
    }

    static void dibujarMapa(char asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + " = ");
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("\n");
        }
    }

}
