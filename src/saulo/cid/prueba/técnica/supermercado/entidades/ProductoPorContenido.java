package saulo.cid.prueba.técnica.supermercado.entidades;

public class ProductoPorContenido extends Producto{

    private Integer contenido;
    private String medida;

    public ProductoPorContenido() {
    }

    public ProductoPorContenido(String nombre, Integer contenido, String medida, Integer precio) {
        super(nombre, precio);
        this.contenido = contenido;
        this.medida = medida;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + medida +" /// Precio: $" + precio;
    }
    
}
