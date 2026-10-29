package aula_5.questao_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem-vindo! Esolha uma bebida:");
        
        int opcao;

        System.out.println("1 - Café");
        System.out.println("2 - Chocolate Quente");
        System.out.println("3 - Chá");
        System.out.println("4 - Suco");

        System.out.println();
        opcao = scan.nextInt();
        System.out.println();
        
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Café!");
                break;
            case 2:
                System.out.println("Você escolheu Chocolate Quente!");
                break;
            case 3:
                System.out.println("Você escolheu Chá!");
                break;
            case 4:
                System.out.println("Você escolheu Suco!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
