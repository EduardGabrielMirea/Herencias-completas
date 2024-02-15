package mercadona;

import mercadona.clientes.Cliente;
import mercadona.empleados.Empleado;

import java.util.HashSet;
import java.util.Set;

public class Supermercado {
    private String nombre;
    private Set<Empleado> empleados;
    private Set<Cliente> clientes;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.empleados = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addEmpleados(Empleado empleado){
        this.empleados.add(empleado);
    }
    public void addClientes(Cliente cliente){
        this.clientes.add(cliente);
    }

    @Override
    public String toString(){
        return "El supermercado "+this.nombre;
    }

}
