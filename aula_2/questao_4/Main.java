package aula_2.questao_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a distância da viagem em km? ");
        double distancia = scan.nextDouble();

        System.out.println("Qual o consumo do veículo em km/l? ");
        double consumo = scan.nextDouble();

        System.out.println("Qual o preço do combustível em R$/l? ");
        double preco = scan.nextDouble();

        double litros = distancia / consumo;
        double custo = litros * preco;

        System.out.println("A distância da viagem é: " + distancia + " km");
        System.out.println("O consumo do veículo é: " + consumo + " km/l");
        System.out.println("O preço do combustível é: R$ " + preco + "/l");
        System.out.println("A quantidade de litros consumidos é: " + litros + " l");
        System.out.println("O custo total da viagem é: R$ " + custo);
    }
}
