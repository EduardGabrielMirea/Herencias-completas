package trabajadores;

public class Oficial extends Operario{


    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public void arreglar() {
        System.out.println(this.getNombre()+" Esta arreglando algo.");
    }

    @Override
    public void clase(){
        System.out.println(getNombre()+ " Es oficial");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
