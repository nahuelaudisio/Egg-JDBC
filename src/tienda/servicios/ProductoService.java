
package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;


public class ProductoService {
  private ProductoDAO dao;

public ProductoService(){
    this.dao = new ProductoDAO();
}

public void crearProducto(String nombre, Double precio, Integer codigoFabricante) throws Exception{
    try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio == null) {
                throw new Exception("Debe indicar el precio");
            }

            if (codigoFabricante == null) {
                throw new Exception("Debe indicar el codigo de fabricante");
            }
            
            //CREAMOS el PRODUCTO
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
                    producto.setCodigoFabricante(codigoFabricante);
             dao.guardarProducto(producto);
        
    } catch (Exception e) {
    throw e;
    }
}

}
