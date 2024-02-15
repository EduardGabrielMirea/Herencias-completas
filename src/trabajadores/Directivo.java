package trabajadores;

public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }
    @Override
    public void clase(){
        System.out.println(getNombre()+ " Es directivo");
    }

    @Override
    public void contable() {
        System.out.println(this.getNombre() + " Esta sacando las cuentas");
    }

    @Override
    public String toString() {
        return "Directivo " + super.getNombre();
    }
}
