package aula_6.questao_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 1;
        boolean senhaCorreta = false;

        while (tentativas <= 2) {
            System.out.println("Tentativa " + tentativas + ": Digite a senha: ");
            String senha = scanner.nextLine();

            System.out.println("Senha errada!");
            tentativas++;
        }

        if (tentativas == 3){
            senhaCorreta = true;
            System.out.println("Tentativa " + tentativas + ": Digite a senha: ");
            String senha = scanner.nextLine();
            System.out.println("Senha correta! Acesso permitido.");
        }
    }
}
