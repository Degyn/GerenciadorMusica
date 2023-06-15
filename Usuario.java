import java.io.*;

public class Usuario implements Serializable {
    private String nome;
    private int id;
    private String login;
    private String senha;

    public Usuario(String nome, int id, String login, String senha) {
        this.nome = nome;
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String toString(){
        return "Nome: " + getNome() + "Identificador: " + getId() +"Login: " + getLogin() + "Senha: " + getSenha();
    }
}
