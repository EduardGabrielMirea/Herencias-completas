package network;
import java.util.List;
public class FotoPublicacion {
    private String id;
    private String autor;
    private String archivoImagen;
    private String titulo;
    private long marcaTemporal;
    private int likes;
    private List<String> comentarios;

    public FotoPublicacion(String id, String autor, String archivoImagen, String titulo, long marcaTemporal, int likes, List<String> comentarios) {
        this.id = id;
        this.autor = autor;
        this.archivoImagen = archivoImagen;
        this.titulo = titulo;
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

    public String getArchivoImagen() {
        return archivoImagen;
    }

    public void setArchivoImagen(String archivoImagen) {
        this.archivoImagen = archivoImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
