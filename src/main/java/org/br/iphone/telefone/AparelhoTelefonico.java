package org.br.iphone.telefone;

public class AparelhoTelefonico implements Telefone{
    @Override
    public void ligar() {
        System.out.println("LIGAR CELULAR");
    }

    @Override
    public void atender() {
        System.out.println("ATENDER CELULAR");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("INICIAR CORREIO DE VOZ");
    }
}
