package model;

/**
 *
 * @author khant
 */
public class Curso {

    int cod_curso;
    String nombre;
    int años_exp;

    public Curso(int cod_curso, String nombre, int años_exp) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.años_exp = años_exp;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAños_exp() {
        return años_exp;
    }

    public void setAños_exp(int años_exp) {
        this.años_exp = años_exp;
    }

    public String toString() {
        return "Curso: " + nombre + ", Requiere" + años_exp + " años de experiencia";
    }
}
