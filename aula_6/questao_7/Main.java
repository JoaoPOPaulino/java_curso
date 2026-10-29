package aula_6.questao_7;

public class Main {
    public static void main(String[] args) {
        int[] escolha = {2, 1, 0};
        int i = 0;
        int opcao;
        
        System.out.println("Menu de opções:");
        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Visualizar perfil");
            System.out.println("2. Alterar configurações");
            System.out.println("3. Suporte técnico");
            System.out.println("0. Sair");

            opcao = escolha[i];
            System.out.println("Opção selecionada: " + opcao);

            switch (opcao) {
                case 1:
                    System.out.println("Visualizando perfil...");
                    break;
                case 2:
                    System.out.println("Alterando configurações...");
                    break;
                case 3:
                    System.out.println("Acessando suporte técnico...");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            i++;
        } while (opcao != 0 && i < escolha.length);
    }
}
