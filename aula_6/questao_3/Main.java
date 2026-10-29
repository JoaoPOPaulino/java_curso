package aula_6.questao_3;

public class Main {
    public static void main(String[] args) {
        int dinheiro = 35;
        int semana = 0;

        while (dinheiro < 200){
            dinheiro += 15;
            semana++;

            System.out.println("Semana: " + semana + " - Dinheiro: " + dinheiro);
        }

        System.out.println("Meta alcançada em " + semana + " semanas, com um total de R$" + dinheiro);
    }
}
