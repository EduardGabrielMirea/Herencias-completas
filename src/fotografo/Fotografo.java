package fotografo;

public class Fotografo  {
    private String nombre;
    private Acciones acciones;

    public Fotografo(String nombre, Acciones acciones) {
        this.nombre = nombre;
        this.acciones = acciones;
    }

    public void tomarFoto(){
        acciones.tomarFoto();
    }
}
