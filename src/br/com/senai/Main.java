package br.com.senai;

public class Main {
    public static void main(String[] args) {
        String nome = "Gabriel";
        int anoNascimento = 2000;
        int anoAtual = 2024;
        int idadeAtual = (anoAtual - anoNascimento);

        System.out.println(nome + " fara " + idadeAtual + " anos em "+ anoAtual);

    }
}