package model;

/**
 *
 * @author khant
 */
public class Docente extends Persona {

    Fecha fec_registro;
    Fecha fec_titulacion;
    boolean docente_vigente;
    String telefono;

    public Docente(String telefono, String DNI, Fecha fec_registro, String nombres, String email, Fecha fec_titulacion, Fecha fec_nac) {
        super(DNI, nombres, fec_nac, email);
        this.fec_registro = fec_registro;
        this.fec_titulacion = fec_titulacion;
        this.docente_vigente = docente_vigente;
        this.telefono = telefono;
    }

    

    public int getTiempoExp() {

        return fec_titulacion.getAño() - 2025;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Experiencia: " + getTiempoExp() + " años";
    }
}
