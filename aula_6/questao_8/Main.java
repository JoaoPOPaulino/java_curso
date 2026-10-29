package aula_6.questao_8;

public class Main {
    public static void main(String[] args) {
        int numero = 7;

        System.out.println("=== TABUADA COMPLETA DO " + numero + " ===");
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        System.out.println();

        System.out.println("\n=== TABUADA DO " + numero + " (APENAS NÚMEROS PARES) ===");
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            if (resultado % 2 == 0) {
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }
}
