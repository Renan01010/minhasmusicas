package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setCantor("Michael");
        minhaMusica.setTitulo("Kiss");
        for (int i = 0; i <20 ; i++) {
            minhaMusica.curtir();
            minhaMusica.reproduzir();
        }
        System.out.println(minhaMusica.getTotalCurtidas());
        System.out.println(minhaMusica.getTotalReproducoes());

        Podcast pod = new Podcast();
        pod.setApresentador("Senna");
        pod.setDescricao("Zulu");
        pod.setTitulo("Show de IA");

        for (int i = 0; i < 50000; i++) {
            pod.reproduzir();
            System.out.println("Reproduções: " + pod.getTotalReproducoes());
        }

        for (int i = 0; i < 5000; i++) {
            pod.curtir();
            System.out.println("Curtidas: " + pod.getTotalCurtidas());
        }
        MinhasPreferidas tops = new MinhasPreferidas();
        tops.inclui(pod);
        tops.inclui(minhaMusica);

    }
}
