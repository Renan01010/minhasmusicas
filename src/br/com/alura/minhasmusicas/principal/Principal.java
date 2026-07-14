package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;

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
    }
}
