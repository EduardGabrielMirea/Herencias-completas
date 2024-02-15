package trabajadores;

import java.util.HashSet;
import java.util.Set;

public abstract class Empleado implements Acciones {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void arreglar() {
    }

    @Override
    public void contable() {

    }

    @Override
    public void comprobar() {

    }

    @Override
    public void clase() {

    }

    @Override
    public String toString(){
        return "EL empleado " +this.nombre;
    }
}
