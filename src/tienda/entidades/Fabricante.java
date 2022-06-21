
package tienda.entidades;


public class Fabricante {
    private Integer cod;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(Integer cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "cod=" + cod + ", nombre=" + nombre + '}';
    }


    
}
