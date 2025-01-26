package controller;

import model.Alumno;

/**
 *
 * @author migue
 */
public class Alumnos {
    public static void main(String[] args) {
        Alumno alumnos[];
        
        alumnos = new Alumno[2]; // contruccion de cada objeto
       // Creacion de valores  para cada objeto 
        alumnos[0] = new Alumno(456, "ANA ABAD", 2024);
        alumnos[1] = new Alumno(456, "ABEL ABAD", 2020);
    
    //Esta es una forma de recrrer los objetos de una coleccion
    // Se declara 
    for(Alumno a:alumnos){
        
        System.out.println("Codigo         : " + a.getCod_alum());
        System.out.println("Nombres         :" + a.getNombres());
        System.out.println("Año de ingreso  :"+   a.getAño_ingreso());
    }}    
}
