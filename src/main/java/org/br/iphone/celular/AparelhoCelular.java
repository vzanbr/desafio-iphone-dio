package org.br.iphone.celular;

import org.br.iphone.musica.Musica;
import org.br.iphone.navegador.Navegador;
import org.br.iphone.telefone.Telefone;

public class AparelhoCelular implements Musica, Navegador, Telefone {
    @Override
    public void tocar() {
        System.out.println("============");
        System.out.println("=========MUSICA=========");
        System.out.println("TOCANDO PELO APARELHO CELULAR");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSAR MUSICA PELO APARELHO CELULAR");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("SELECIONAR MUSICA PELO APARELHO CELULAR");
        System.out.println("============");
    }

    @Override
    public void exibirPagina() {
        System.out.println("=========NAVEGADOR=========");
        System.out.println("EXIBIR PAGINA PELO APARELHO CELULAR");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADC NOVA ABA PELO APARELHO CELULAR");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATT PAGINA PELO APARELHO CELULAR");
        System.out.println("============");
    }

    @Override
    public void ligar() {
        System.out.println("=========TELEFONE=========");
        System.out.println("LIGAR PELO APARELHO CELULAR");
    }

    @Override
    public void atender() {
        System.out.println("ATENDER PELO APARELHO CELULAR");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("INICIAR CORREIO DE VOZ PELO APARELHO CELULAR");
        System.out.println("============");
    }
}
