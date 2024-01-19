package saulo.cid.prueba.técnica.supermercado.servicios;

import java.util.ArrayList;
import saulo.cid.prueba.técnica.supermercado.entidades.Producto;
import saulo.cid.prueba.técnica.supermercado.entidades.ProductoPorContenido;
import saulo.cid.prueba.técnica.supermercado.entidades.ProductoPorKg;
import saulo.cid.prueba.técnica.supermercado.entidades.ProductoPorLitro;

public class ProductoServicio {

    public void mostrarProductos(ArrayList<Producto> productos){
        for (Producto producto : productos) {
            if(producto instanceof ProductoPorContenido){
                System.out.println(producto.toString());
            }
            if(producto instanceof ProductoPorLitro){
                System.out.println(producto.toString());
            }
            if(producto instanceof ProductoPorKg){
                System.out.println(producto.toString());
            }
        }
    }

}
