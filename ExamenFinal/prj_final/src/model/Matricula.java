
package model;

/**
 *
 * @author khant
 */
public class Matricula {
    
    CursoAperturado cursoMatriculado;
    Alumno alumno;
    Boolean pagado;

    public Matricula(CursoAperturado cursoMatriculado, Alumno alumno, Boolean pagado) {
       if(alumno.getEdad()>=18){
        this.cursoMatriculado = cursoMatriculado;
        this.alumno = alumno;
        this.pagado = pagado;}else{System.out.println("El alumno debe ser mayor de 18 años para amtricularse");}
    }

    public CursoAperturado getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(CursoAperturado cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
    
}
