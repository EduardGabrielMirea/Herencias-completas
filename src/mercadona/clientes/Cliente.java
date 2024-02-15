package mercadona.clientes;

import mercadona.Supermercado;

public class Cliente {
    private String nombre;

    private Supermercado supermercado;

    public Cliente(String nombre, Supermercado supermercado) {
        this.nombre = nombre;
        this.supermercado = supermercado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

}
