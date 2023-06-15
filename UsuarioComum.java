import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioComum extends Usuario {
    private List<Musica> colecaoParticular;
    private final String ARQUIVO_COLECAO = "colecao_" + getId() + ".bin";

    public UsuarioComum(String nome, int id, String login, String senha) {
        super(nome, id, login, senha);
        this.colecaoParticular = new ArrayList<>();
        carregarColecaoParticular();
    }

    public void adicionarMusicaColecaoParticular(Musica musica) {
        colecaoParticular.add(musica);
        salvarColecaoParticular();
    }

    public void removerMusicaColecaoParticular(Musica musica) {
        colecaoParticular.remove(musica);
        salvarColecaoParticular();
    }

    public Musica buscarMusicaColecaoParticular(String titulo) {
        for (Musica musica : colecaoParticular) {
            if (musica.getTitulo().equals(titulo)) {
                return musica;
            }
        }
        return null;
    }

    public void visualizarColecaoParticular() {
        System.out.println("Coleção Particular de " + getNome() + ":");
        for (Musica musica : colecaoParticular) {
            System.out.println("Título: " + musica.getTitulo());
            System.out.println("Duração: " + musica.getDuracaoMinutos() + ":" + musica.getDuracaoSegundos());
            System.out.println("Autores: " + musica.getAutores());
            System.out.println("Gênero Musical: " + musica.getGeneroMusical());
            System.out.println();
        }
    }

    private void salvarColecaoParticular() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ARQUIVO_COLECAO))) {
            outputStream.writeObject(colecaoParticular);
        } catch (IOException e) {
            System.out.println("Erro ao salvar a coleção particular: " + e.getMessage());
        }
    }

    private void carregarColecaoParticular() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ARQUIVO_COLECAO))) {
            colecaoParticular = (List<Musica>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar a coleção particular: " + e.getMessage());
        }
    }
}
