package tienda;

/*
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
import java.util.Scanner;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

public class JDBC_1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        FabricanteService fabricanteService = new FabricanteService();
        ProductoService productoService = new ProductoService();
        ProductoDAO productoDao = new ProductoDAO();
FabricanteDAO fabricanteDao = new FabricanteDAO();
  int bandera= 0;

        try {
       
            //int opc;
            do {
    
                int opc;
                System.out.println("----------------------------------BIENVENIDO-----------------------");
                System.out.println("MENU");
                System.out.println("OPCION -> 1 - LISTAR TODOS LOS NOMBRES DE LA TABLA PRODUCTO");
                System.out.println("OPCION -> 2 - LISTAR EL NOMBRE Y PRECIO DE TODOS LOS PRODUCTOS DE SU TABLA ");
                System.out.println("OPCION -> 3 - LISTAR LOS PRODUCTOS QUE TIENEN UN PRECIO 120 Y 202 DOLARES $");
                System.out.println("OPCION -> 4 - BUSCAR LOS PRODUCTOS QUE SON PORTATILES DE LA TABLA PRODUCTO");
                System.out.println("OPCION -> 5 - LISTAR EL NOMBRE Y EL PRECIO DEL PRODUCTO MAS BARATO");
                System.out.println("OPCION -> 6 - INGRESE UN NUEVO PRODUCTO A LA BASE DE DATOS");
                System.out.println("OPCION -> 7 - INGRESE UN NUEVO FABRICANTE A LA BASE DE DATOS");
                System.out.println("OPCION -> 8 - MODIFICAR EL PRECIO DE UN PRODUCTO DE LOS YA CARGADOS A LA BASE DE DATOS");
                System.out.println("OPCION -> 9 - SALIR DEL MENU");

                System.out.println();
                System.out.println("INGRESE UNA OPCION DE LAS QUE SE ENCUENTRAN EN EL MENU (1 Al 9)");
                opc = leer.nextInt();
                
                switch (opc) {
                    case 1:
                        System.out.println("LISTA DE TODOS LOS NOMBRES DE LA TABLA PRODUCTO");
                        productoDao.verProductosPorNombre();
                        break;
                    case 2:
                        System.out.println("LISTA DE LOS NOMBRES Y PRECIOS DE LA TABLA PRODUCTO");
                        productoDao.verProductosPorNombrePrecio();
                        break;
                    case 3:
                        System.out.println("LISTA DE LOS PRODUCTOS CON PRECIOS ENTRE 120 Y 202 DOLARES($)");
                        productoDao.verProductosBetween();
                        break;
                    case 4:
                        System.out.println("LISTA DE LOS PORTATILES DE LA TABLA PRODUCTO");
                        productoDao.verProductosPortatiles();
                        break;
                          case 5:
                              System.out.println("NOMBRE Y PRECIO DEL PRODUCTO MÁS BARATO");
                              productoDao.verProductoMasBarato();
                        break;
                          case 6:
                              System.out.println("BIENVENIDO AL SISTEMA DE NUEVO PRODUCTO");
//         
//                              System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
//                              String nombre = leer.nextLine();
//                              System.out.println("INGRESE EL PRECIO DEL PRDUCTO ($)");
//                              Double precio = leer.nextDouble();
//                              System.out.println("INGRESE CODIGO DE FABRICANTE");
//                              Integer codigoFabricante = leer.nextInt();
//                              
                              productoService.crearProducto("Notebook LENOVO", 56564.4101, 1);
                              System.out.println("LISTA DE PRODUCTOS");
                              productoDao.verProductosTodos();
                        break;
                          case 7:
                              System.out.println("BIENVENIDO AL SISTEMA DE NUEVO FABRICANTE");
//
//                              System.out.println("INGRESE EL NOMBRE DEL FABRICANTE");
//                              String nombre1 ;
//                              nombre1 =  leer.nextLine();
                              fabricanteService.crearFabricante("YOKO");
                              fabricanteDao.verFabricantes();
                        break;
                          case 8:
//                              System.out.println("BIENVENIDO A LA OPCION DE MODIFICAR EL PRECIO DE UN PRODUCTO");
//  
//                              System.out.println("ACA TIENE LOS NOMBRE DE LOS PRODUCTOS QUE QUIERE MODIFICAR EL PRECIO");
//                              productoDao.verProductosTodos();
//     
//                              System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A MODIFICAR EL PRECIO");
//                              String nombre3 = leer.nextLine();
//                              System.out.println("INGRESE EL NUEVO PRECIO DEL PRODUCTO");
//                              Double precio2 = leer.nextDouble();
                              productoDao.modificarPrecio("SONY", 5654.25565);
                              System.out.println("LISTA CON EL PRECIO DEL PRODUCTO MODIFICADO");
                              productoDao.verProductosTodos();
                        break;
                          case 9:
                              System.out.println("GRACIAS POR INTERACTUAR CON NOSOTROS");
                              System.out.println("NOS VEMOS");
                              bandera +=1;
                              break;
                              
                    default:
                        System.out.println("ERROR DE OPCIONES DISPONIBLES ");
                        break;
                }

            } while (bandera == 0);

        } catch (Exception e) {
        }

    }
}
