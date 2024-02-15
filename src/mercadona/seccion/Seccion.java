package mercadona.seccion;

public class Seccion {
    private String seccion;

    public Seccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    /*public viod dirigir(){
    }
     */

    public void serEncargado(){
        System.out.println("Es encargado de la seccion " +this.seccion);
    }


    @Override
    public String toString(){
        return "Es encargado de la seccion de " +this.seccion;
    }
}
