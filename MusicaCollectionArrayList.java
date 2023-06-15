import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MusicaCollectionArrayList extends MusicaCollection{

    public MusicaCollectionArrayList() {
        super();
        this.setMusicas(new ArrayList<Musica>());
    }
    public MusicaCollectionArrayList(MusicaCollectionArrayList musics) {
        super();
        this.setMusicas(musics);
    }

    @Override
    public boolean addMusica(Musica musica) {
        Musica mc = buscarMusica(musica.getTitulo());
        if (mc == null) {
            musicas.add(musica);
            setqtdMusicas(getqtdMusicas() + 1);
            return true;
        }
        return false;
    }

    @Override
    public Musica removerMusica(Musica musica) {
        Musica mc = buscarMusica(musica.getTitulo());
        if (mc != null) {
            musicas.remove(mc);
            setqtdMusicas(getqtdMusicas() - 1);
        }
        return mc;
    }
    

    @Override
    public boolean remove(Object o) {
        return getMusicas().remove(o);
    }

    @Override
    public Musica buscarMusica(String titulo) {
        for (Musica mc: musicas) {
            if (mc.getTitulo().equals(titulo)) {
                return mc;
            }
        }
        return null;
    }


    @Override
    public boolean editarMusica(Musica musica) {
        Musica mc = buscarMusica(musica.getTitulo());
        if (mc != null) {
            mc.setId(musica.getId());
            mc.setTitulo(musica.getTitulo());
            mc.setAutores(musica.getAutores());
            mc.setGeneroMusical(musica.getGeneroMusical());
            mc.setData(musica.getData());
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Musica musica) {
        if (contains(musica)) {
            return false;
        }
        return getMusicas().add(musica);
    }


    @Override
    public int size() {
        return getqtdMusicas();
    }

    @Override
    public boolean isEmpty() {
        return getqtdMusicas() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Musica m: getMusicas()) {
            if (m.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Musica> iterator() {
        return getMusicas().iterator();
    }

    @Override
    public Object[] toArray() {
        return getMusicas().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return getMusicas().toArray(a);
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return getMusicas().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Musica> c) {
        return getMusicas().addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return getMusicas().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return getMusicas().retainAll(c);
    }

    @Override
    public void clear() {
        getMusicas().clear();
    }

    @Override
    public void mostrarMusica() {
        for (Musica mc : getMusicas()){
            System.out.println(mc.toString());
        }
    }
}
    

