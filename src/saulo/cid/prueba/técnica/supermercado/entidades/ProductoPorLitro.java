
package saulo.cid.prueba.técnica.supermercado.entidades;

public class ProductoPorLitro extends Producto{
    
    private Double litro;

    public ProductoPorLitro() {
    }

    public ProductoPorLitro(String nombre, Double litro, Integer precio) {
        super(nombre, precio);
        this.litro = litro;
    }

    public Double getLitro() {
        return litro;
    }

    public void setLitro(Double litro) {
        this.litro = litro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litro + " /// Precio: $" + precio;
    }
    
}
