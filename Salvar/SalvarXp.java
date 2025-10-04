package Salvar;

import Classes.Personagem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalvarXp {
    public void salvarExperiencia(Personagem jogador){
        String caminhoDoArquivo = "data.txt";

        try (PrintWriter escrever = new PrintWriter(new FileWriter(caminhoDoArquivo))) {
            escrever.println(jogador.getExperiencia());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante o salvamento do arquivo: " + e.getMessage());

        }
    }
}