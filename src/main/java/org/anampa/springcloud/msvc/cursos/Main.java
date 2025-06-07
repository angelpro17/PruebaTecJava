package org.anampa.springcloud.msvc.cursos;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char asientos [][] = new char [10][10];
        int fila, asiento;
        boolean reservado = false;

        for(int filas = 0; filas < 10; filas++){
            for(int columnas = 0; columnas < 10; columnas++){
                asientos[filas][columnas] = 'L';
            }
        }
        while (reservado == false) {
            System.out.println("----Bienvenidos al sistema de reserva de asientos----");
            String visualizar;

            System.out.println("Desea visualizar los asientos disponibles? (S/N)");
            visualizar = teclado.next();
            if (visualizar.equalsIgnoreCase("S")) {
                dibujar(asientos);
            }
            System.out.println("Ingrese el numero de fila que desea reservar: ");
            fila = teclado.nextInt();
            System.out.println("Ingrese el numero de asiento que desea reservar: ");
            asiento = teclado.nextInt();

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("Su asiento ha sido reservado correctamente");
            } else {
                System.out.println("Este asiento ya esta reservado por otro cliente");
            }

            System.out.println("Desea reservar otro asiento? (S/N)");
            String respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("N")) {
                reservado = true;
            }
        }
    }

    static void dibujar(char asientos [][]){
        for ( int filas = 0; filas < 10; filas++ ) {
            for ( int columnas = 0; columnas < 10; columnas++ ) {
                System.out.print("["+asientos[filas][columnas]+"] ");
            }
            System.out.println();
        }
    }
}