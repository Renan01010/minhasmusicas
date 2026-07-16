package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>= 9){
            System.out.println(audio.getTitulo()+ " é uma das tops do momento");
        }else {
            System.out.println(audio.getTitulo()+ " tbm é umas das que todo mundo está curtindo!");
        }
    }
}
