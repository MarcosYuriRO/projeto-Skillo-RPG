import Classes.*;
import Controle.Jogo;
import Inimigo.EscolheInimigo;
import Inimigo.TurnoInimigo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.menuInicial();
    }
}