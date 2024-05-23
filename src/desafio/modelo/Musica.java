package desafio.modelo;

public class Musica extends Audio{
    private String Album;
    private String Artista;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 200) {
            return 10;
        } else {
            return 7;
        }
    }
}
