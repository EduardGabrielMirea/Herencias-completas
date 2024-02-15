package network;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class MotorRedSocial {

        private List<TextoPublicacion> publicacionesTexto;
        private List<FotoPublicacion> publicacionesFotograficas;

        public MotorRedSocial() {
            this.publicacionesTexto = new ArrayList<>();
            this.publicacionesFotograficas = new ArrayList<>();
        }

    public List<TextoPublicacion> getPublicacionesTexto() {
        return publicacionesTexto;
    }

    public void setPublicacionesTexto(List<TextoPublicacion> publicacionesTexto) {
        this.publicacionesTexto = publicacionesTexto;
    }

    public List<FotoPublicacion> getPublicacionesFotograficas() {
        return publicacionesFotograficas;
    }

    public void setPublicacionesFotograficas(List<FotoPublicacion> publicacionesFotograficas) {
        this.publicacionesFotograficas = publicacionesFotograficas;
    }

    // Métodos para generar ID único, crear publicaciones, búsqueda, mostrar lista, eliminar información, etc.

        public void agregarPublicacionTexto(TextoPublicacion textoPublicacion) {
            this.publicacionesTexto.add(textoPublicacion);
        }

        public void agregarPublicacionFoto(FotoPublicacion fotoPublicacion) {
            this.publicacionesFotograficas.add(fotoPublicacion);
        }

    public List<TextoPublicacion> buscarPublicacionesUsuario(String nombreUsuario) {
        List<TextoPublicacion> publicacionesUsuario = new ArrayList<>();

        for (TextoPublicacion texto : publicacionesTexto) {
            if (texto.getAutor().equals(nombreUsuario)) {
                publicacionesUsuario.add(texto);
            }
        }

        return publicacionesUsuario;
    }

    public List<FotoPublicacion> buscarPublicacionesUsuarioFotograficas(String nombreUsuario) {
        List<FotoPublicacion> publicacionesUsuario = new ArrayList<>();

        for (FotoPublicacion foto : publicacionesFotograficas) {
            if (foto.getAutor().equals(nombreUsuario)) {
                publicacionesUsuario.add(foto);
            }
        }

        return publicacionesUsuario;
    }

    public List<TextoPublicacion> mostrarPublicacionesUsuario(String nombreUsuario) {
        List<TextoPublicacion> publicacionesUsuario = new ArrayList<>();

        for (TextoPublicacion texto : publicacionesTexto) {
            if (texto.getAutor().equals(nombreUsuario)) {
                publicacionesUsuario.add(texto);
            }
        }

        return publicacionesUsuario;
    }

    public void eliminarInformacion(String idPublicacion) {
        Iterator<TextoPublicacion> iterTexto = publicacionesTexto.iterator();
        while (iterTexto.hasNext()) {
            TextoPublicacion texto = iterTexto.next();
            if (texto.getId().equals(idPublicacion)) {
                iterTexto.remove();
                return;
            }
        }

        Iterator<FotoPublicacion> iterFoto = publicacionesFotograficas.iterator();
        while (iterFoto.hasNext()) {
            FotoPublicacion foto = iterFoto.next();
            if (foto.getId().equals(idPublicacion)) {
                iterFoto.remove();
                return;
            }
        }
    }
}


