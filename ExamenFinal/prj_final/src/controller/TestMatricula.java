package controller;

import model.Alumno;
import model.Curso;
import model.CursoAperturado;
import model.Docente;
import model.Fecha;

/**
 *
 * @author khant
 */
public class TestMatricula {

    public static void main(String[] args) {
        Fecha fechNacmAlum = new Fecha(10, 5, 2004);
        Fecha fechRegistroAlum = new Fecha(26, 1, 2025);
        Fecha fechNacmDoc = new Fecha(15, 8, 1985);
        Fecha fechTitulacionDoc = new Fecha(10, 12, 2010);

        Alumno alumno = new Alumno(fechRegistroAlum, "15975312", "654753147", "Juan perez", fechNacmAlum, "juan@gmail.com");
        Docente docente = new Docente("15975312", "Juan perez", fechNacmDoc, "juan@gmail.com", "987456123", fechRegistroAlum, fechTitulacionDoc);
        Curso curso = new Curso(202, "Diseño Grafico", 10);
        
        try{
            CursoAperturado cursoAperturado = new CursoAperturado(1, docente, curso,fechRegistroAlum );
            System.out.println("Curso aperturado con exito");
        } catch (Exception e){
            System.out.println("Error, no se aperturo el curso" + e.getMessage());
        }
        
        System.out.println(alumno);
        System.out.println(docente);
    }

}
