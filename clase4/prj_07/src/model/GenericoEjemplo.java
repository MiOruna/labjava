package model;

/**
 *
 * @author migue
 */
public class GenericoEjemplo<T> { // T es que sera reemplazado como 

    private T dato;

    public GenericoEjemplo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;

    }
}
