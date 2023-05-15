/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_rodriguezjose;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class Examen1_RodriguezJose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int exi = 1;
        while (exi == 1) {
            System.out.println("....Bienvenido al menu....");
            System.out.println("1. Ejercicios de palabaras");
            System.out.println("2. Salir");
            int opt = entrada.nextInt();

            switch (opt) {
                case 1: {

                    String ejercicios;

                    ejercicios();
                    break;

                }

                case 2: {
                    salir();
                    exi++;
                }
                default: {
                    System.out.println("Error");
                    System.out.println("Opcion no valida");
                }
            }
        }

    }

    public static String ejercicios() {

        //creacion de metodo para ejercicios
        Scanner entrada = new Scanner(System.in);
        //solicitando formacion
        System.out.println("Ingrese la primera oracion o palabra: ");
        String cadena1 = entrada.nextLine();

        System.out.println("Ingrese la segunda oracion o palabra: ");
        String cadena2 = entrada.nextLine();
        //variables
        String cadenaf = "";
        String cadenatot = "";
        //contadores
        int contcadena1 = 0;
        int contcadena2 = 0;
        //calculo de caracteres totales en las palabras
        for (int i = 0; i < cadena1.length(); i++) {
            cadenatot += cadena1.charAt(i);
            contcadena1 = i;
        }

        for (int i = 0; i < cadena2.length(); i++) {
            cadenatot += cadena2.charAt(i);

            contcadena2 = i;
        }
        //primer evalua si una cadena es igual a la otra
        if (cadena1.equalsIgnoreCase(cadena2)) {
            for (int i = cadena2.length() - 1; i >= 0; i--) {
                cadenaf += cadena2.charAt(i);
            }
            System.out.println("Las dos cadenas son iguales: " + cadena1 + cadenaf);
            //Si los totales de caracteres son iguales 
        } else if (contcadena1 == contcadena2) {
            System.out.println("");
            //la cadena imprime cada caracter 
            for (int i = 0; i <= cadena1.length() - 1; i++) {
                cadenaf += cadena1.charAt(i);

                cadenaf += cadena2.charAt(i);

            }
            System.out.println("Las cadenas tienen la misma longitud" + cadenaf);
            //si las cadenas son diferentes entonces imprime las palabras juntas
        } else {
            System.out.println("Las cadenas son diferentes: " + cadena1 + cadena2);
        }
        return cadena2;

    }

    public static void salir() {
        //metodo para salir del menu
        System.out.println("Gracias por usar mi programa... ");
        System.out.println("....Saliendo....");

    }
}
