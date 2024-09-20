package Main.User;

import Main.Programas.NavegadorInternet;
import Main.Programas.ReprodutorMusical;
import Main.Programas.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Telefone tele = new Telefone();
        tele.ligar("12346789");
        tele.atender();
        tele.iniciarCorreioVoz();
        System.out.println("  ");
        ReprodutorMusical ipod = new ReprodutorMusical();
        ipod.SelectMusic("Elevator Track.003");
        ipod.tocar();
        ipod.pausar();
        System.out.println(" ");
        NavegadorInternet explorer = new NavegadorInternet();
        explorer.ExibirPagina("Google.com");
        explorer.adicionarAba();
        explorer.AtualizarPagina();
    }
}
