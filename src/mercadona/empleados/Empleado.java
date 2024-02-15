package mercadona.empleados;

import mercadona.Supermercado;
import mercadona.seccion.Seccion;

import java.util.Set;

public class Empleado {
    private String nombre;
    private int codigo;
    private Supermercado supermercado;
    private Set<Seccion> secciones;

    public Empleado(String nombre, int codigo, Supermercado supermercado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.supermercado = supermercado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }



    //METODOS
    public void turnoMañana(){
        System.out.println(this.nombre+" ha fichado a las 8:00 am.");
    }
    public void turnoTarde(){
        System.out.println(this.nombre+ " ha fichado a las 3:00 pm.");
    }
    public void acabarMañana(){
        System.out.println(this.nombre+ " se ha ido a las 3:00 pm.");
    }
    public void acabarTarde(){
        System.out.println(this.nombre+ " se ha ido a las 11:00 pm.");
    }
    public void reponer(){
        System.out.println(this.nombre+" repone articulos.");
    }

    public void cobrar(){
        System.out.println(this.nombre+ " esta en caja cobrando.");
    }

    public void cortarPescado(){
        System.out.println(this.nombre+ " esta cortando pescado.");
    }

}
