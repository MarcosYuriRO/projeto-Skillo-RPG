package Controle;

import Classes.Personagem;

public class Exp {
    private int custoNivel;

    private final int VALOR_GANHO_XP = 10;

    public void acrescentarXp(Personagem jogador){
        jogador.setExperiencia(jogador.getExperiencia() + VALOR_GANHO_XP);

        cobrarPeloNivel(jogador);
        if (jogador.getExperiencia() >= custoNivel){
            subirDeNivel(jogador);
            jogador.setExperiencia(jogador.getExperiencia() - custoNivel);
        }
        System.out.println("Experiência Atual: " + jogador.getExperiencia());
    }

    private void cobrarPeloNivel(Personagem jogador){
        int nivelPersonagem = jogador.getNivel();

        switch (nivelPersonagem){
            case 1:
                custoNivel = 20;
                break;
            case 5:
                custoNivel = 30;

                break;
            case 10:
                custoNivel = 40;

                break;
            case 15:
                custoNivel = 50;

                break;

        }
    }

    private void subirDeNivel(Personagem jogador){
        jogador.setNivel(jogador.getNivel() + 1);
        System.out.println("Seu personagem subiu de Nível!");

        jogador.exibirStatus();
    }
}