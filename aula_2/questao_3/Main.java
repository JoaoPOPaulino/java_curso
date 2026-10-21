package aula_2.questao_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salario = scan.nextDouble();

        System.out.println("Digite o percentual de desconto: ");
        double percentual = scan.nextDouble();

        double desconto = salario * (percentual / 100);

        double liquido = salario - desconto;

        System.out.println("O valor líquido do salário é: " + liquido);
    }
}
