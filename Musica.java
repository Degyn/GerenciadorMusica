import java.util.Date;

public abstract class Musica {
    private int id;
    private String titulo;
    private int duracaoMinutos;
    private int duracaoSegundos;
    private String autores;
    private Date data;
    private String generoMusical;

    public Musica(int id, String titulo, int duracaoMinutos, int duracaoSegundos,
                  String autores, Date data, String generoMusical) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.duracaoSegundos = duracaoSegundos;
        this.autores = autores;
        this.data = data;
        this.generoMusical = generoMusical;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public String getAutores() {
        return autores;
    }

    public Date getData() {
        return data;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(String autores){
        this.autores = autores;
    }

    public void setGeneroMusical(String generoMusical){
        this.generoMusical = generoMusical;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String toString() {
        return titulo + " - " + autores;
    }


}
    

