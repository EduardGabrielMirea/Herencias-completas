package fotografo;

public class Camara implements Acciones{
    private String  marca;

    public Camara(String marca) {
        this.marca = marca;
    }

    @Override
    public void tomarFoto(){
        System.out.println("Toma foto con camara.");
    }
}
