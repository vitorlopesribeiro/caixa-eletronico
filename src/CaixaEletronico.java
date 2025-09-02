import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 2500.00;
        int opcao;

        do {
 
            System.out.println("\n=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor (Depósito)");
            System.out.println("3 - Transferir Valor (Saque)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a depositar: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
                    break;

                case 3:
                    System.out.print("Digite o valor a sacar: R$ ");
                    double saque = scanner.nextDouble();
                    if(saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por usar o caixa eletrônico. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while(opcao != 4);

        scanner.close();
    }
}