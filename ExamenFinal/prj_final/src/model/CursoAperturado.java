package model;

/**
 *
 * @author khant
 */
public class CursoAperturado {

    int cod_curso_apertura;
    Docente docente;
    Curso curso;
    Fecha fecha_inicio;

    public CursoAperturado(int cod_curso_apertura, Docente docente, Curso curso, Fecha fecha_inicio) {
        if (docente.getTiempoExp() >= curso.getAños_exp()) {
            this.cod_curso_apertura = cod_curso_apertura;
            this.docente = docente;
            this.curso = curso;
            this.fecha_inicio = fecha_inicio;
        } else {
            System.out.println("El Docente no tiene experiencia para este curso");
        }

    }

    public int getCod_curso_apertura() {
        return cod_curso_apertura;
    }

    public void setCod_curso_apertura(int cod_curso_apertura) {
        this.cod_curso_apertura = cod_curso_apertura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Fecha getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Fecha fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

}
