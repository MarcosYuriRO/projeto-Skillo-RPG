package Controle;

import Classes.Personagem;
import Salvar.SalvarXp;

import java.util.Scanner;

public class MenuInicial {
    private int opcao;

    Scanner scanner = new Scanner(System.in);
    Jogo jogo = new Jogo();
    SalvarXp salvarXp = new SalvarXp();

    public void exibirMenuInicial(){

        do {
            System.out.println("""
                    1. Iniciar Jogo;
                    2. Salvar Jogo;
                    3. Regras;
                    4. Sair.
                    """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    jogo.exibirMenuJogo();

                    break;
                case 2:


                    break;
                case 3:
                    System.out.println("""
                            
                            🐱‍🐉
                            """);

                    break;
                case 4:
                    System.out.println("Adeus! \uD83D\uDC4B");
                    break;
                default:
                    System.out.println("Opção Inválida!");

            }
        } while(opcao != 4);


    }
}