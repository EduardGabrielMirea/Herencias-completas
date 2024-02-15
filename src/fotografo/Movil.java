package fotografo;

public class Movil implements Acciones {

    private String marca;

    public Movil(String marca) {
        this.marca = marca;
    }
    @Override
    public void tomarFoto(){
        System.out.println("Tomar foto con movil.");
    }
}
