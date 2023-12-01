package br.com.ispotefai.principal;

import br.com.ispotefai.model.MinhasPreferidas;
import br.com.ispotefai.model.Musica;
import br.com.ispotefai.model.Podcast;

public class Main {
    public static void main(String[] args) {


        Musica musica1 = new Musica();

        musica1.setTitulo("Can't cath me now");
        musica1.setArtista("Olivia Rodrigo");

        for(int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for(int i = 0; i < 100; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();

        podcast1.setTitulo("Podpah");
        podcast1.setHost("Igão");

        for(int i = 0; i < 100; i++) {
            podcast1.reproduz();
        }

        for(int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        MinhasPreferidas mp = new MinhasPreferidas();
        mp.inclui(podcast1);
        mp.inclui(musica1);

    }
}