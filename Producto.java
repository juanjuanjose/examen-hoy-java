public class Producto {
    private int cantidad;
    private String codigo;
    private String nombre;
    private String descripcion;

    public Producto(int cantidad, String codigo, String nombre, String descripcion) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto= " +
                "cantidad:" + cantidad +
                ", codigo:'" + codigo + '\'' +
                ", nombre:'" + nombre + '\'' +
                ", descripcion:'" + descripcion + '\'' ;
    }
}
