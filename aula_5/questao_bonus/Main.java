package aula_5.questao_bonus;

import java.util.Scanner;

class Chamado {
    private int numero;
    private String descricao;
    private String titular;
    private String prioridade;
    private String status;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        prioridade = prioridade.toUpperCase();
        if (prioridade.equals("BAIXA") || 
            prioridade.equals("MEDIA") || 
            prioridade.equals("ALTA")) {
            this.prioridade = prioridade;
        } else {
            this.prioridade = "MEDIA";
        }
    }

    public String getStatus() {
        return status;
    }

    public void chamadoEm_Andamento() {
        this.status = "Em andamento";
        System.out.println("Chamado " + numero + " está em andamento.");
    }

    public void chamadoResolvido() {
        this.status = "Resolvido";
        System.out.println("Chamado " + numero + " foi resolvido.");
    }

    public Chamado(int numero, String descricao, String titular, String prioridade) {
        this.numero = numero;
        this.descricao = descricao;
        this.titular = titular;
        this.status = "Aberto";
        setPrioridade(prioridade);
    }

    public void exibirResumo() {
        System.out.println("Número do chamado: " + numero);
        System.out.println("Descrição: " + descricao);
        System.out.println("Titular: " + titular);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Status: " + status);
    }
}

class ChamadoHardware extends Chamado {
    private String equipamento;
    
   public ChamadoHardware(int numero, String descricao, String titular, String prioridade){
        super(numero, descricao, titular, prioridade);
    }

    public void registrarEquipamento(String equipamento) {
        this.equipamento = equipamento;
        System.out.println("Equipamento registrado: " + equipamento);
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("Equipamento: " + equipamento);
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
} 


class ChamadoSoftware extends Chamado {
    private String sistemaAfetado;

    public ChamadoSoftware(int numero, String descricao, String titular, String prioridade) {
        super(numero, descricao, titular, prioridade);
    }

    public void registrarSistemaAfetado(String sistemaAfetado) {
        this.sistemaAfetado = sistemaAfetado;
        System.out.println("Sistema afetado registrado: " + sistemaAfetado);
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("Sistema afetado: " + sistemaAfetado);
    }

    public String getSistemaAfetado() {
        return sistemaAfetado;
    }

    public void setSistemaAfetado(String sistemaAfetado) {
        this.sistemaAfetado = sistemaAfetado;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           
        System.out.println("Bem-vindo ao sistema de chamados!");
        System.out.println("Escolha o tipo de chamado que deseja registrar:");
        System.out.println("1 - Chamado de Hardware");
        System.out.println("2 - Chamado de Software");
        int tipoChamado = scan.nextInt();

        System.out.println("Por favor, insira os detalhes do chamado:");
        System.out.println("================================");
        System.out.println("Número do chamado: ");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.println("================================");
        System.out.println("Descrição do chamado: ");
        String descricao = scan.nextLine();

        System.out.println("================================");
        System.out.println("Titular do chamado: ");
        String titular = scan.nextLine();

        System.out.println("================================");
        System.out.println("Prioridade do chamado (BAIXA, MEDIA, ALTA): ");
        String prioridade = scan.nextLine();

        switch (tipoChamado) {
            case 1:
                System.out.println("Qual o equipamento? ");
                String equipamento = scan.nextLine();
                ChamadoHardware chamadoHardware = new ChamadoHardware(numero, descricao, titular, prioridade);
                chamadoHardware.registrarEquipamento(equipamento);
                System.out.println();
                chamadoHardware.exibirResumo();
                System.out.println();
                chamadoHardware.chamadoEm_Andamento();
                chamadoHardware.exibirResumo();
                System.out.println();
                chamadoHardware.chamadoResolvido();
                chamadoHardware.exibirResumo();
                break;
            case 2:
                System.out.println("Qual o sistema afetado? ");
                String sistemaAfetado = scan.nextLine();
                ChamadoSoftware chamadoSoftware = new ChamadoSoftware(numero, descricao, titular, prioridade);
                chamadoSoftware.registrarSistemaAfetado(sistemaAfetado);
                System.out.println();
                chamadoSoftware.exibirResumo();
                System.out.println();
                chamadoSoftware.chamadoEm_Andamento();
                chamadoSoftware.exibirResumo();
                System.out.println();
                chamadoSoftware.chamadoResolvido();
                chamadoSoftware.exibirResumo();
                break;
            default:
                System.out.println("Opção inválida! Por favor, escolha 1 ou 2.");
        }

    }
}
