package fotografo;

public class VisionPro implements Acciones {

    private String marca;

    public VisionPro(String marca) {
        this.marca = marca;
    }
    @Override
    public void tomarFoto(){
        System.out.println("Tomar foto con VisionPro.");
    }
}
