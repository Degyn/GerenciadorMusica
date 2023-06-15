import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SistemaUsuarios {
    private static final String ARQUIVO_LOGIN = "login.enc";

    public static void main(String[] args) {
        // Exemplo de uso
        Adm administrador = new Adm("Admin", 1, "admin", "admin123");
        UsuarioComum usuarioComum = new UsuarioComum("Usuário Comum", 2, "usuario", "senha123");

        // Salvar usuários no arquivo binário
        salvarUsuarios(administrador, usuarioComum);

        // Carregar usuários do arquivo binário
        Usuario[] usuarios = carregarUsuarios();

        // Exibir usuários carregados
        if (usuarios != null) {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.toString());
            }
        }
    }

    public static void salvarUsuarios(Usuario... usuarios) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ARQUIVO_LOGIN))) {
            outputStream.writeObject(usuarios);
            System.out.println("Usuários salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os usuários: " + e.getMessage());
        }
    }

    public static Usuario[] carregarUsuarios() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ARQUIVO_LOGIN))) {
            return (Usuario[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar os usuários: " + e.getMessage());
        }
        return null;
    }
}
    
