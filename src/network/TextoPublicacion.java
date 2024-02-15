package network;
import java.util.List;

public class TextoPublicacion {
    private String id;
    private String autor;
    private String mensaje;
    private long marcaTemporal;
    private int likes;
    private List<String> comentarios;

    public TextoPublicacion(String id, String autor, String mensaje, long marcaTemporal, int likes, List<String> comentarios) {
        this.id = id;
        this.autor = autor;
        this.mensaje = mensaje;
        this.marcaTemporal = marcaTemporal;
        this.likes = likes;
        this.comentarios = comentarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public long getMarcaTemporal() {
        return marcaTemporal;
    }

    public void setMarcaTemporal(long marcaTemporal) {
        this.marcaTemporal = marcaTemporal;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
