package network;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del motor de la red social
        MotorRedSocial motor = new MotorRedSocial();

        // Crear algunas publicaciones de texto
        TextoPublicacion texto1 = new TextoPublicacion("1", "usuario1", "Este es un mensaje de texto.", System.currentTimeMillis(), 0, new ArrayList<>());
        TextoPublicacion texto2 = new TextoPublicacion("2", "usuario2", "Otro mensaje interesante.", System.currentTimeMillis(), 0, new ArrayList<>());

        // Agregar las publicaciones de texto al motor
        motor.agregarPublicacionTexto(texto1);
        motor.agregarPublicacionTexto(texto2);

        // Crear algunas publicaciones fotográficas
        FotoPublicacion foto1 = new FotoPublicacion("3", "usuario1", "imagen1.jpg", "Título de la imagen", System.currentTimeMillis(), 0, new ArrayList<>());
        FotoPublicacion foto2 = new FotoPublicacion("4", "usuario3", "imagen2.jpg", "Otra imagen increíble", System.currentTimeMillis(), 0, new ArrayList<>());

        // Agregar las publicaciones fotográficas al motor
        motor.agregarPublicacionFoto(foto1);
        motor.agregarPublicacionFoto(foto2);

        // Mostrar la lista de publicaciones de un usuario
        List<TextoPublicacion> publicacionesUsuario1 = motor.mostrarPublicacionesUsuario("usuario1");
        System.out.println("Publicaciones de usuario1:");
        for (TextoPublicacion texto : publicacionesUsuario1) {
            System.out.println(texto.getMensaje());
        }

        // Eliminar una publicación
        motor.eliminarInformacion("2");

        // Mostrar la lista actualizada de publicaciones de un usuario
        List<TextoPublicacion> publicacionesUsuario2 = motor.mostrarPublicacionesUsuario("usuario2");
        System.out.println("Publicaciones de usuario2:");
        for (TextoPublicacion texto : publicacionesUsuario2) {
            System.out.println(texto.getMensaje());

        }
    }
}
