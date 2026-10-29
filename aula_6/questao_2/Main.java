package aula_6.questao_2;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;
        for (int i = 1; i <= 50; i++) {
            soma += i;
            if ( i % 2 == 0){
                contador++;
            }
        }
        System.out.println("A soma dos números de 1 a 50 é: " + soma);
        System.out.println("A quantidade de números pares de 1 a 50 é: " + contador);
    }
}
