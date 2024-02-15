package mercadona;

import mercadona.empleados.Empleado;
import mercadona.seccion.Seccion;

public class Main {
    public static void main(String[] args) {


        //-------Supermercado------//
        Supermercado mercadona = new Supermercado("Mercadona");

        //---------Empleados-------//
        Empleado eddy = new Empleado("Eddy",111,mercadona);
        Empleado adrian = new Empleado("Adrian",222,mercadona);
        Empleado brian = new Empleado("Brian",333,mercadona);

        Seccion pescaderia = new Seccion("Pescaderia");
        Seccion caja = new Seccion("Caja");
        Seccion pasillo = new Seccion("Pasillo");



        //----Encargado----//
        //Recordatorio//
        /*Eddy eddy = new Eddy("Eddy",111,mercadona);
        Brian brian = new Brian("Brian",222,mercadona);
        Adrian adrian = new Adrian("Adrian",333,mercadona);
         */

        //-------Clientes--------//


        //--------DEBUG---------//
        
        System.out.println(""+mercadona);
        System.out.println("\n");

            eddy.turnoMañana();
            //eddy.setEncargados(pasillo);
            eddy.reponer();
            eddy.acabarMañana();
        System.out.println("\n");

            brian.turnoTarde();
            //brian.setEncargados(caja);
            brian.cobrar();
            brian.acabarTarde();
        System.out.println("\n");

            adrian.turnoTarde();
        //System.out.println(adrian.getEncargados());
            adrian.cortarPescado();
            adrian.acabarTarde();


    }

}
