import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo a estufa automatizada!");

        int opcao;
        do {
            System.out.println("\nEscolha a opção desejada:");
            System.out.println("===== Menu =====");
            System.out.println("1 - Ventilação");
            System.out.println("2 - Irrigação");
            System.out.println("3 - Aquecimento");
            System.out.println("4 - Iluminação");
            System.out.println("5 - Fechar o menu.");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nA ventilação foi ligada!");
                    break;
                case 2:
                    System.out.println("\nA irrigação foi ligada!");
                    break;
                case 3:
                    System.out.println("\nO aquecimento foi ligado!");
                    break;
                case 4:
                    System.out.println("\nA iluminação foi ligada!");
                    break;
                case 5:
                    System.out.println("\nO menu foi fechado!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 5);

        scan.close();
    }
}
