public class Persona {

    protected String nombre;
    protected String apellido;
    protected int documento;
    protected int edad;

    public Persona () {

    }

    public Persona(int edad, int documento, String apellido, String nombre) {
        this.edad = edad;
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", edad=" + edad +
                '}';
    }

    public String mostrarInfo () {
        return "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad;
    }
}