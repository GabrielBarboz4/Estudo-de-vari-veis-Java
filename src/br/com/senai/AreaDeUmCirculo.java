package br.com.senai;

public class AreaDeUmCirculo {
    public static void main(String[] args) {
        double circDiametro = 9;
        double calcRaio = circDiametro / 2;
        double pi = 3.14;

        double calcArea = pi * (calcRaio * calcRaio);

        System.out.println(calcArea + " unidades de área");
    }
}
