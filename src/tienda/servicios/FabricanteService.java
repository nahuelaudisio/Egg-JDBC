package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(String nombre) throws Exception {
        try {
            //VALIDAMOS
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre para el fabricante");

            }

            //CREAMOS FABRICANTE
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

}
