package aula_1.questao_3;

public class Main_1 {
    public static void main(String[] args) {
        double valorParcela = 100.0;
        int quantidadeParcelas = 5;
        double valorTotal = valorParcela * quantidadeParcelas;
        
        System.out.println();
        System.out.println("Seja bem-vindo ao sistema de cálculo de parcelas!");
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("Quantidade de parcelas abertas              - " + quantidadeParcelas);
        System.out.println("Valor de cada parcela                       - R$" + valorParcela);
        System.out.println("Valor total a ser pago                      - R$" + valorTotal);
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("Obrigado por utilizar o sistema de cálculo de parcelas!");
        System.out.println("Volte sempre!");
    }
}
