package controller;

import model.Alumno;

/**
 *
 * @author migue
 */
public class ArregloNumeros {

    public static void main(String[] args) {
        int n1[];  // declaracion de una variable arreglo   
        // Antes de reservarse memoria a una variable
        // la variable es Nula (nul)
        n1 = new int[5]; // construccion el objerto n1
        // reservacion de memoria ( 5 elem de tipo int)  
        //con memoria resrvada, usar la variable
        // os indices van desde cero hasta tamaño_arreglo-1

        n1[0] = 10;  // que la posicion del indice 0 se asigna el
        n1[1] = 15;
        n1[2] = 18;
        n1[3] = 7;
        n1[4] = 11;

        // mostrar
        for (int i = 0; i < n1.length; i++) {
            System.out.println("n1[" + i + "] es " + n1[i]);
        }

        Alumno alumnos[], alum1; // alum1 es  objeto sin ninguna referencia

        //Dejar sin memoria a alum1 para posteriormente inicializarlo
        alum1 = null; // justo despue de haber declarado el objeto alumno

        // En alguna parte se ah incializado alum1
        alum1 = new Alumno(1234, "ANA ABAD", 2022);

        //muchas lineas adelante se comprobará
        if (alum1 == null) {
            System.out.println("alum1 sin memoria o no hay datos inresados");
        } else {
            System.out.println(alum1);
        }
        System.out.println(alum1);

    }

}
