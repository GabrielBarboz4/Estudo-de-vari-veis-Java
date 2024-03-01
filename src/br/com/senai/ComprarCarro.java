package br.com.senai;

public class ComprarCarro {
    public static void main(String[] args) {
        double custoCarro = 5500;
        double porcentVendedor = 0.25;
        double porcentImposto = 0.45;

        double custoConsumidor = custoCarro + (custoCarro + (custoCarro*porcentVendedor)) + (custoCarro + (custoCarro * porcentImposto));

        System.out.println("O custo final do carro ao consumidor foi de R$ " + custoConsumidor + " reais");
    }
}
