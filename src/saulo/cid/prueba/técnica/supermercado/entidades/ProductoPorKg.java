package saulo.cid.prueba.técnica.supermercado.entidades;

public class ProductoPorKg extends Producto{

    private String medida;

    public ProductoPorKg() {
    }

    public ProductoPorKg(String nombre, Integer precio, String medida) {
        super(nombre, precio);
        this.medida = medida;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + medida;
    }
     
}
