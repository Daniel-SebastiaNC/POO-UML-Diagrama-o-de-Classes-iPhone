package equipamento.iphone;

import equipamento.navegador.Navegador;
import equipamento.repodutorMusicial.ReprodutoeMusical;
import equipamento.tefone.AparelhoTelefonico;

public class IPhone implements AparelhoTelefonico, Navegador, ReprodutoeMusical {
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selencionando música");

    }

    public void exibirPagina() {
        System.out.println("Exibindo página");

    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizanod página");
    }

    public void ligar() {
        System.out.println("ligando para número xxxxxx");
    }

    public void atender() {
        System.out.println("antendendo chamada");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Ouvindo correio de voz");
    }
}
