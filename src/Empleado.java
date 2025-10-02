public class Empleado extends Persona {

    private String tipoContrato;
    private int sueldo;


    public Empleado() {
    }

    public Empleado(int edad, int documento, String apellido, String nombre, String tipoComtrato, int sueldo) {
        super(edad, documento, apellido, nombre);
        this.tipoContrato = tipoComtrato;
        this.sueldo = sueldo;
    }

    public String getTipoComtrato() {
        return tipoContrato;
    }

    public void setTipoComtrato(String tipoComtrato) {
        this.tipoContrato = tipoComtrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "tipoComtrato='" + tipoContrato + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }


    @Override
    public String mostrarInfo () {
        return "SOY UN EMPLEADO: " + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", categoria: " + ", tipo de contrato: " + tipoContrato + ", sueldo: " + sueldo;
    }
}
