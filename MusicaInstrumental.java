import java.util.Date;

class MusicaInstrumental extends Musica {
    private String arquivoPartitura;

    public MusicaInstrumental(int identificador, String titulo, int duracaoMinutos, int duracaoSegundos,
                              String autores, Date data, String generoMusical, String arquivoPartitura) {
        super(identificador, titulo, duracaoMinutos, duracaoSegundos, autores, data, generoMusical);
        this.arquivoPartitura = arquivoPartitura;
    }

    public String getArquivoPartitura() {
        return arquivoPartitura;
    }

    public void setArquivoPartitura(String arquivoPartitura) {
        this.arquivoPartitura = arquivoPartitura;
    }
}
