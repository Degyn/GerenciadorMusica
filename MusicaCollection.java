import java.util.Collection;

public abstract class MusicaCollection implements Collection<Musica>{

    private int qtdMusicas;
    protected Collection<Musica> musicas;

    public abstract Musica buscarMusica(String titulo);
    public abstract boolean addMusica(Musica musicas);
    public abstract Musica removerMusica(Musica musicas);
    public abstract boolean editarMusica(Musica musicas);
    public abstract void mostrarMusica();
   
    public MusicaCollection(){
        qtdMusicas = 0;
    }

    public int getqtdMusicas() {
        return qtdMusicas;
    }

    public void setqtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public Collection<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(Collection<Musica> musicas) {
        this.musicas = musicas;
    }
    
}
