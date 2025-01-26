package controller;

import java.util.ArrayList;
import model.Alumno;

/**
 *
 * @author migue
 */
public class ArrayListEjemplo {

    public static void main(String[] args) {
        //Un ArrayList sirve ara almacenar objetos de cuaquier tipo
        ArrayList lista; // declrar un arreglo dinamico
        lista = new ArrayList(); // Dar el espacio inicial de memoria
        Alumno alu = new Alumno(5555, "Abel Abad", 2022);
        
        lista.add("Mensaje 1"); // Se ingresa Strings
        lista.add("Mensaje 2");
        lista.add("Mensaje 3");
        lista.add("Mensaje 4");
        lista.add("Saludos");
        // Se ingresa otro tipo de dato
        lista.add(new Alumno(5555, "Abel Abad", 2022));
        
        if(lista.remove(alu)){
            System.out.println("Elemento eliminado");
        }
        
        System.out.println("La lista con un elmento eliminado tiene " +lista );
        // Muestra de lo guardado
        for (Object e : lista) {
            if (e instanceof Alumno) { // se verifica si el objeto e es una instancia
                System.out.println((Alumno) e); // si es instancia de Alumno, imprimir
            } else { // de otra forma mostrar las cadenas
                System.out.println((String) e);// el OBJETO se transforma a String
            }

        }
        
    }

}
