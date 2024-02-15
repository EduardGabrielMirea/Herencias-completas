package trabajadores;

public class Main {
    public static void main(String[] args) {
           Directivo juan = new Directivo("Juan");
                System.out.println(juan);
                juan.contable();
           Oficial eddy = new Oficial("Eddy");
                eddy.clase();
                eddy.arreglar();
           Tecnico brian = new Tecnico("Brian");
                brian.clase();
                brian.comprobar();
    }
}
