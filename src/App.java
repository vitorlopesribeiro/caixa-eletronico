import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta carteira = new Conta();
        carteira.setSaldo(2500);
        
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
                    carteira.consulta();
                    break;

                case 2:
                    System.out.println("\nDigite o valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();
                    carteira.deposita(deposito);
                    break;

                case 3:
                    System.out.print("\nDigite o valor a sacar: R$ ");
                    double saque = scanner.nextDouble();
                    carteira.saca(saque);
                    break;

                case 4:
                    System.out.println("\nObrigado por usar o caixa eletrônico. Até logo!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while(opcao != 4);

        scanner.close();
    }
}
