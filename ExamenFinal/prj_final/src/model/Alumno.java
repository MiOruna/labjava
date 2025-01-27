package model;

/**
 *
 * @author khant
 */
public class Alumno extends Persona {

    Fecha fec_registro;
    boolean alumno_vigente;
    String telefono;

    public Alumno(Fecha fec_registro, String telefono, String DNI, String nombres, Fecha fec_nac, String email) {
        super(DNI, nombres, fec_nac, email);
        this.fec_registro = fec_registro;
        this.alumno_vigente = alumno_vigente;
        this.telefono = telefono;
    }

    

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public boolean isAlumno_vigente() {
        return alumno_vigente;
    }

    public void setAlumno_vigente(boolean alumno_vigente) {
        this.alumno_vigente = alumno_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Fecha getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Fecha fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
    

    @Override
    public String toString() {
        return super.toString() + ", Telefono: " + telefono + ", Fecha Registro " + fec_registro;
    }
}
