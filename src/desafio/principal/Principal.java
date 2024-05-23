package desafio.principal;

import desafio.modelo.MinhasPreferidas;
import desafio.modelo.Musica;
import desafio.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        MinhasPreferidas preferidas = new MinhasPreferidas();

        musica.setNome("Space Oddity");
        musica.setArtista("David Bowie");
        musica.setAno(1969);
        musica.setAlbum("David Bowie");

        podcast.setNome("GeekTech");
        podcast.setHosts("Matheus");
        podcast.setTipo("Gravado");

        for (int i = 0; i < 2000; i++) {
            musica.toca();
        }
        for (int i = 0; i < 1901; i++) {
            musica.curte();

        }
        for (int i = 0; i < 100; i++) {
            podcast.toca();
        }
        for (int i = 0; i < 47; i++) {
            podcast.curte();

        }

        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
