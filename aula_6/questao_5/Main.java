package aula_6.questao_5;

public class Main {
    public static void main(String[] args) {
        int [] valores = {12, 7, 18, 4, 21, 10, 3};

        int quantidade = 0;
        int soma = 0;
        
        for (int i = 0; i < valores.length; i++){
            if (valores[i] > 10){
                quantidade++;
                soma += valores[i];
            }
        }
        System.out.println("Quantidade de valores maiores que 10: " + quantidade);
        System.out.println("Soma dos valores maiores que 10: " + soma);
    }
}
