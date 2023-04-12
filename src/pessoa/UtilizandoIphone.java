package pessoa;
import aparelho.*;

public class UtilizandoIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        iphone.tocar();

    }
}
