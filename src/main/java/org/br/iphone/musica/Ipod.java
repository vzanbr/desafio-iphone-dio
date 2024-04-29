package org.br.iphone.musica;

public class Ipod implements Musica {
    @Override
    public void tocar() {
        System.out.println("CELULAR TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PARADA");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("SELECIONAR MUSICA");
        System.out.println("\n");
    }
}
