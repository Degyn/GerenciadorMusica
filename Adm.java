class Adm extends Usuario {
    
    public Adm(String nome, int identificador, String login, String senha) {
        super(nome, identificador, login, senha);
    }

    public boolean updateMusic(MusicaCollection musicaCollection, Musica musica) {
        return musicaCollection.editarMusica(musica);
    }
    public boolean deletarUsuario(String login) {

    
    
    }

}

       
