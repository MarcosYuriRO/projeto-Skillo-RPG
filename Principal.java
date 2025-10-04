import Classes.*;
import Controle.Jogo;
import Controle.MenuInicial;
import Inimigo.EscolheInimigo;
import Inimigo.TurnoInimigo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //MenuInicial menuInicial = new MenuInicial();
        //menuInicial.exibirMenuInicial();

        Jogo jogo = new Jogo();
        jogo.exibirMenuInicial();
    }
}