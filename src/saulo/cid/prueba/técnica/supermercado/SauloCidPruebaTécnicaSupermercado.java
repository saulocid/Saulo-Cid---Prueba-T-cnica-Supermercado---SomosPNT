package saulo.cid.prueba.técnica.supermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import saulo.cid.prueba.técnica.supermercado.entidades.Producto;
import saulo.cid.prueba.técnica.supermercado.entidades.ProductoPorContenido;
import saulo.cid.prueba.técnica.supermercado.entidades.ProductoPorKg;
import saulo.cid.prueba.técnica.supermercado.entidades.ProductoPorLitro;
import saulo.cid.prueba.técnica.supermercado.servicios.ProductoServicio;

public class SauloCidPruebaTécnicaSupermercado {

    public static void main(String[] args) {
        
        ProductoServicio ps = new ProductoServicio();
        ArrayList<Producto> productos = new ArrayList<>();
        
        productos.add(new ProductoPorLitro("Coca-Cola Zero", 1.5d, 20));
        productos.add(new ProductoPorLitro("Coca-Cola", 1.5d, 18));
        productos.add(new ProductoPorContenido("Shampoo Sedal", 500, "ml", 19));
        productos.add(new ProductoPorKg("Frutillas", 64, "kilo"));
        
        ps.mostrarProductos(productos);
        
        System.out.println("=".repeat(29));
        
        Collections.sort(productos, Comparator.comparingDouble(Producto::getPrecio).reversed());
        
        System.out.println("Producto más caro: " + productos.get(0).getNombre());
        System.out.println("Producto más barato: " + productos.get(productos.size()-1).getNombre());
        
    }
    
}
