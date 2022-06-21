package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
public void guardarFabricante(Fabricante fabricante) throws Exception{
    
    try {
        if (fabricante == null) {
            throw new Exception("Debe indicar un fabricante");
        }
        
        String sql = "INSERT INTO fabricante (nombre)" 
                + "VALUES ('" + fabricante.getNombre() +"'); ";
        
        insertarModificarEliminar(sql);
    } catch (Exception e) {
        throw e;
    }finally{
        desconectarBase();
    }
}

                  public void verFabricantes() throws Exception{
        try {
            String sql = "SELECT * FROM fabricante; ";
            
            consultarBase(sql);
            while (resultado.next()) {                
                System.out.println(" | " + resultado.getInt("codigo") + " | " + resultado.getString("nombre") + " | ");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error del sistema");
        }
    }   
    
}
