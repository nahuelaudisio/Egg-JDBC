
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;

public final class ProductoDAO extends DAO{
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void guardarProducto(Producto producto) throws Exception{
        try {
            if (producto == null) {
                     throw new Exception("Debe indicar el PRODUCTO");
            }
                  String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + " ," + producto.getCodigoFabricante() + " );";      
                  
                  insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    public void modificarPrecio(String nombre, Double precio) throws Exception{
        try {
            String sql = "UPDATE producto SET precio = " + precio + " WHERE nombre = '" + nombre + "' ;";
            insertarModificarEliminar(sql);
         } catch (Exception e) {
        throw e;
        }
    }
    
    public void verProductosPorNombre() throws Exception{
        try {
            String sql = "SELECT nombre FROM producto;";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(resultado.getString("nombre"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }

        public void verProductosPorNombreYCodigo() throws Exception{
        try {
            String sql = "SELECT codigo, nombre FROM producto;";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(" | " + resultado.getInt("codigo") + " | " +resultado.getString("nombre") + " | ");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
        
        
        
        
            public void verProductosPorNombrePrecio() throws Exception{
        try {
            String sql = "SELECT nombre, precio FROM producto;";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(resultado.getString("nombre") + " | " +resultado.getDouble("precio"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }
            
//            /* 17. Lista todos los productos que tengan un precio entre $60 y $200. 
//Utilizando el operador BETWEEN. */ 
//
// select * from producto where precio between 60 and 200;
//

//c) Listar aquellos productos que su precio esté entre 120 y 202.
            
                  public void verProductosBetween() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 and 202;";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(" | " + resultado.getInt("codigo") + " | " + resultado.getString("nombre") + " | "  +resultado.getDouble("precio") +" $");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }      
            
//select * from producto where nombre like '%Portátil%';
                  
                  
                  public void verProductosPortatiles() throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portátil%'; ";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(" | " + resultado.getInt("codigo") + " | " + resultado.getString("nombre") + " | " + " $ " +resultado.getDouble("precio") 
                        + resultado.getInt("codigo_fabricante"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }      
                  
                  //select nombre , precio from producto order by precio asc limit 1;
                  
                         public void verProductoMasBarato() throws Exception{
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1; ";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(" | " + resultado.getString("nombre") + " | " + " $ " +resultado.getDouble("precio"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }           
                  public void verProductosTodos() throws Exception{
        try {
            String sql = "SELECT * FROM producto; ";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(" | " + resultado.getInt("codigo") + " | " + resultado.getString("nombre") + " | " + " $ " +resultado.getDouble("precio") 
                        + resultado.getInt("codigo_fabricante"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }      
}
