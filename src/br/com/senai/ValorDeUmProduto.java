package br.com.senai;

public class ValorDeUmProduto {
    public static void main(String[] args) {
            double produto1 = 1960.90;
            double valorDescEAcrec = 0.05;

        System.out.println("O seu PC gamer da Casas Bahia está saindo pela bagatela de R$ " + produto1);
        System.out.println("Ofereçemos 3 opções de compra para você \n");

        System.out.println("1 opção - 3 vezes com juros");
        System.out.println("Valor das parcelas R$ " + (produto1 + (produto1 * valorDescEAcrec))/3);
        System.out.println("O valor final fica R$" + (produto1 + (produto1*valorDescEAcrec)));
        System.out.println("\n");

        System.out.println("2 opção - 2 vezes sem juros");
        System.out.println("Valor das parcelas R$ " + (produto1 / 2));
        System.out.println("\n");

        System.out.println("3 opção - á vista");
        System.out.println("Com 5 % de desconto, o valor final fica R$ " + (produto1 - (produto1*valorDescEAcrec)));
    }
}
