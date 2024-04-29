package org.br.iphone.navegador;

public class Internet implements Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("EXIBIR PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADC NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATT PAGINA");
    }
}
