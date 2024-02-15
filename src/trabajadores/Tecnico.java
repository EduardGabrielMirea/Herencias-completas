package trabajadores;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }


    @Override
    public void comprobar() {
        System.out.println(this.getNombre()+ " Esta comprobando la maquina acabada.");
    }

    @Override
    public void clase(){
        System.out.println(getNombre()+ " Es tecnico");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
