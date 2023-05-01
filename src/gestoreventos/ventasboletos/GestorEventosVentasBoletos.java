/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestoreventos.ventasboletos;

import java.util.Scanner;

/**
 *
 * @author Willy Morales
 */
public class GestorEventosVentasBoletos {

    // Matriz que representará los asientos del evento
    //Prueba con 10 filas y 10 columnas de 0 a 9
    
    static boolean[][] asientos = new boolean[10][10];

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        //Breve bienvendia de menu en consola, que no se debe repetir en el ciclo
        
         System.out.println("********************************************");
            System.out.println("Bienvenidos");
        System.out.println("*********************************************");

        boolean salir = false;
        while (!salir) {//Inicio de while
            
            // Pedimos al usuario que seleccione una opción del menú
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver asientos disponibles y ocupados");
            System.out.println("2. Reservar un asiento");
            System.out.println("3. Salir");
            
            int opcion = tc.nextInt();

            switch (opcion) {
                case 1:
                    // Mostramos los asientos disponibles y ocupados
                    mostrarAsientos();
                    break;
                case 2:
                    // Pedimos al usuario que seleccione un asiento
                    System.out.println("Ingrese la fila del asiento que desea reservar \nDe izquierda a derecha iniciando en cero hasta 9:");
                    int fila = tc.nextInt();
                    System.out.println("Ingrese la columna del asiento que desea reservar\nDe arriba a abajo iniciando en cero hasta 9:");
                    int columna = tc.nextInt();

                    // Verificamos si el asiento está disponible
                    if (asientos[fila][columna]) {
                        System.out.println("Lo siento, ese asiento ya esta ocupado.");
                    } else {
                        // Reservamos el asiento
                        asientos[fila][columna] = true;
                        System.out.println("¡Asiento reservado con exito!");
                    }
                    break;
                case 3:
                    // Salimos del programa
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        }
    }

    // Método para mostrar los asientos
    static void mostrarAsientos() {
        System.out.println("Asientos disponibles: O / Asientos ocupados: X\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (asientos[i][j]) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[O]");
                }
            }
            System.out.println();
        }
    
 
    
    }//Fin Clase Main
    
}//Fin Clase Principal
