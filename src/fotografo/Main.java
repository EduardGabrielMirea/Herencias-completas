package fotografo;

public class Main {

    public static void main(String[] args) {
        Camara cannor = new Camara("Cannon");
            Fotografo maria = new Fotografo("Maria",cannor);
                maria.tomarFoto();
        Movil samsung = new Movil("Samsung");
            Fotografo eddy = new Fotografo("Eddy",samsung);
                eddy.tomarFoto();
        VisionPro vp = new VisionPro("Apple");
            Fotografo brian = new Fotografo("Brian",vp);
                 brian.tomarFoto();
    }
}
