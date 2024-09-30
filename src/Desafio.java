import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Bruce Wayne";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("-----------------------------");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n----------------------------");

        int opcao = 0;

        String menu = """
                \n
                ---Digite sua opção---
                1- Consultar seu saldo
                2- Transferir valor
                3- Depositar valor
                4- Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("O seu saldo é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja transferir");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Você não possui saldo suficiente");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Você transferiu " + valorTransferencia);
                    System.out.println("Seu saldo atual é de " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor você deseja depositar ");
                double valorDeposito = leitura.nextDouble();
                saldo += valorDeposito;
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcao == 4) {
                System.out.println("Você optou por sair, até mais :)");
            }else{
                System.out.println("Opção inválida. Tente novamente");
            }
        }
    }
}
