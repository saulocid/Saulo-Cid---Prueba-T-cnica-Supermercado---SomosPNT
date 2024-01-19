package saulo.cid.prueba.técnica.supermercado.entidades;

public class Producto {

    protected String nombre;
    protected Integer precio;
    
    public Producto() {
    }

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
}
