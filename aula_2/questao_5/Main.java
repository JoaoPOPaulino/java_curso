package aula_2.questao_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        System.out.println("Digita a quantidade de parcelas: ");
        int parcelas = scan.nextInt();

        System.out.println("Digite o percentual de juros: ");
        double percentual = scan.nextDouble();

        double juros = preco * (percentual / 100);
        double precoFinal = preco + juros;
        double parcela = precoFinal / parcelas;

        System.out.printf("O preço do produto é: R$ %.2f%n", preco);
        System.out.println("A quantidade de parcelas é: " + parcelas);
        System.out.printf("O percentual de juros é: %.2f%%%n", percentual);
        System.out.printf("O valor dos juros é: R$ %.2f%n", juros);
        System.out.printf("O preço final do produto é: R$ %.2f%n", precoFinal);
        System.out.printf("O valor de cada parcela é: R$ %.2f%n", parcela);
    }
}
