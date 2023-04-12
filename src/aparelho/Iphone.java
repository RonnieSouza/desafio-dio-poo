package aparelho;
import funcionalidades.*;

public class Iphone implements Internet , Ipod , Phone {

    public void ligar() {
        System.out.println("Ligando");

    }

    public void atender() {
        System.out.println("Atendendo");

    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");

    }

    public void tocar() {
        System.out.println("Tocando Musica");

    }

    public void pausar() {
        System.out.println("Musica Pausada");

    }

    public void selecionarMusica() {
        System.out.println("Selecionando Musica");

    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina da Internet");

    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba de Internet");

    }

    public void atualizarPagina() {
        System.out.println("Pagina Atualizada com Sucesso");

    }
}
