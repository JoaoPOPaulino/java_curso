package aula_5.questao_3;

import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao chamado de suporte!");
        System.out.println("\n Por favor, selecione o tipo de chamado: ");

        int opcao;

        System.out.println("1 - Problema de Internet");
        System.out.println("2 - Problema com impressora");
        System.out.println("3 - Problema com o sistema");
        System.out.println("4 - Solicitação de acesso");
        System.out.println("5 - Outro");
        System.out.println("6 - Fechar o menu");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Problema de internet foi selecionado. Vamos te passar para o setor responsável.");
                break;
            case 2:
                System.out.println("Problema com impressora foi selecionado. Vamos te passar para o setor responsável.");
                break;
            case 3:
                System.out.println("Problema com o sistema foi selecionado. Vamos te passar para o setor responsável.");
                break;
            case 4:
                System.out.println("Problema com o acesso foi selecionado. Vamos te passar para o setor responsável.");
                break;
            case 5:
                System.out.println("Escreva seu problema, que iremos te direcionar para o setor correto.");
                String texto = scan.nextLine();

                System.out.println("Seu problema é: " + texto);
                System.out.println("\nEstamos te redirecionando para o setor responsável.");
                break;
            case 6:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
