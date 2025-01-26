
package controller;
import model.GenericoEjemplo;
import model.Alumno;
/**
 *
 * @author migue
 */
public class TestGenerico {
    public static void main(String[] args) {
        GenericoEjemplo<Integer> g1 = new GenericoEjemplo<>(10);
        System.out.println("g1 + 5 es " + (g1.getDato()+5));
        
        GenericoEjemplo<Alumno> g2 = new GenericoEjemplo<>(new Alumno(7777, "Ana Maria", 2025));
    }
}
