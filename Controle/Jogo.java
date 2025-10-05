package Controle;

import Classes.*;
import Inimigo.EscolheInimigo;
import Inimigo.TurnoInimigo;
import Salvar.SalvarXp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Jogo {
    private int opcao;
    private int turno = 1;

    Scanner scan = new Scanner(System.in);
    Exp exp = new Exp();
    Personagem jogador = new Personagem("a", "b", "c");
    Scanner scanner = new Scanner(System.in);
    SalvarXp salvarXp = new SalvarXp();

    public void exibirMenuJogo() {
        System.out.println("Em uma arena, existem cinco personagens espalhados...\n" +
                "1-Ragnar, o Bárbaro.\n" +
                "2-Merlim, a Maga.\n" +
                "3-Arthar, o Arqueiro.\n" +
                "4-Ankhler, o Ladino.\n" +
                "5-Lilith, a Drúida.\n" +
                "Selecione seu heroi!");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1 -> {
                criarBarbaro();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                Batalha(jogador, inimigo);

                if (jogador.getVida() <= 0) {
                    System.out.println("Você perdeu!");
                } else {
                    System.out.println("Você venceu!");
                    exp.acrescentarXp(jogador);
                }
            }
            case 2 -> {
                criarMago();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                Batalha(jogador, inimigo);

                if (jogador.getVida() <= 0) {
                    System.out.println("Você perdeu!");
                } else {
                    System.out.println("Você venceu!");
                    exp.acrescentarXp(jogador);
                }
            }
            case 3 -> {
                criarArqueiro();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                Batalha(jogador, inimigo);

                if (jogador.getVida() <= 0) {
                    System.out.println("Você perdeu!");
                } else {
                    System.out.println("Você venceu!");
                    exp.acrescentarXp(jogador);
                }
            }
            case 4 -> {
                criarLadino();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                Batalha(jogador, inimigo);

                if (jogador.getVida() <= 0) {
                    System.out.println("Você perdeu!");
                } else {
                    System.out.println("Você venceu!");
                    exp.acrescentarXp(jogador);
                }
            }
            case 5 -> {
                criarDruida();
                Personagem inimigo = EscolheInimigo.escolheInimigo();
                System.out.println("Seu inimigo é: " + inimigo.getNome() + " (" + inimigo.getClasse() + ")");

                Batalha(jogador, inimigo);

                if (jogador.getVida() <= 0) {
                    System.out.println("Você perdeu!");
                } else {
                    System.out.println("Você venceu!");
                    exp.acrescentarXp(jogador);
                }
            }

            default -> System.out.println("Opção Inválida!");

        }
    }

    private void Batalha(Personagem jogador, Personagem inimigo){
        do {
            System.out.println("\nTurno " + turno + ":");
            System.out.println("1- Ataque Comum");
            System.out.println("2- Ataque Especial");
            System.out.println("3- Ver status do jogador");
            System.out.println("4- Analisar inimigo");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> {
                    jogador.atacar(inimigo);
                    System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                    if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                    turno++;
                }
                case 2 -> {
                    jogador.ataqueEspecial(inimigo);
                    System.out.println(inimigo.getNome() + ": " + inimigo.getVida() + " Vida.");
                    System.out.println(jogador.getNome() + ": " + jogador.getEnergia() + " Energia.");
                    if (inimigo.getVida() > 0) TurnoInimigo.agir(inimigo, jogador);
                    turno++;
                }
                case 3 -> jogador.exibirStatus();
                case 4 -> inimigo.exibirStatus();
                default -> System.out.println("Comando inválido.");
            }

        } while (jogador.getVida() > 0 && inimigo.getVida() > 0);
    }

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
                    exibirMenuJogo();

                    break;
                case 2:
                    salvarXp.salvarExperiencia(jogador);

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

    private void criarBarbaro() {
        jogador = new Barbaro();
    }

    private void criarMago(){
        jogador = new Mago();
    }

    private void criarArqueiro(){
        jogador = new Arqueiro();
    }

    private void criarLadino(){
        jogador = new Ladino();
    }

    private void criarDruida(){
        jogador = new Druida();
    }
}
