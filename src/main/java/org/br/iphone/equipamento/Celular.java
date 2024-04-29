package org.br.iphone.equipamento;

import org.br.iphone.celular.AparelhoCelular;
import org.br.iphone.musica.Musica;
import org.br.iphone.navegador.Navegador;
import org.br.iphone.telefone.Telefone;

public class Celular {
    public static void main(String[] args) {

        AparelhoCelular ap = new AparelhoCelular();

        Musica musica = ap;
        Navegador navegador = ap;
        Telefone telefone = ap;

        musica.tocar();
        musica.pausar();
        musica.SelecionarMusica();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorrerioVoz();
    }
}
