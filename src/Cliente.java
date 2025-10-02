public class Cliente extends Persona {

    private String categoria;
    private String codigo;


    public Cliente() {
    }

    public Cliente(int edad, int documento, String apellido, String nombre, String categoria, String codigo) {
        super(edad, documento, apellido, nombre);
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "categoria='" + categoria + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public String mostrarInfo () {
        return "SOY UN CLIENTE: " + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", categoria: " + categoria + ", codigo: " + codigo;
    }
}