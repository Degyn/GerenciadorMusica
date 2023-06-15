import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

class Cancao extends Musica {
    private String letra;

    public Cancao(int identificador, String titulo, int duracaoMinutos, int duracaoSegundos,
                  String autores, Date data, String generoMusical, String letra) {
        super(identificador, titulo, duracaoMinutos, duracaoSegundos, autores, data, generoMusical);
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void carregarLetra(String arquivo) throws IOException {
        byte[] bytes = Files.readAllBytes(new File(arquivo).toPath());
        this.letra = new String(bytes);
    }
}
    
