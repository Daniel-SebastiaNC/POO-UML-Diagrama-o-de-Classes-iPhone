package usando;

import equipamento.iphone.IPhone;

public class Usando {
    
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

     
}
