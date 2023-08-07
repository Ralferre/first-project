import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nomeCliente = "";
        String tipoConta = "";
        String menu = "";
        int option = 0;
        double saldo = 3000, deposito = 0, debito = 0;

        System.out.print("Digite nome completo do cliente: ");
        Scanner entrada = new Scanner(System.in);
        nomeCliente = entrada.nextLine();
        nomeCliente = nomeCliente.toUpperCase();
        System.out.print("Digite o tipo de conta do cliente: ");
        tipoConta = entrada.nextLine();
        tipoConta = tipoConta.toUpperCase();
        System.out.println("********************************************");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("********************************************");

        menu = """
                Selecione uma das opções abaixo:
                1- Consultar saldo;
                2- Depositar ou receber via Pix;
                3- Efetuar pagamento no débito, saque ou transferência;
                4- Sair da aplicação;
                """;
        while (option != 4) {
            System.out.println(menu);
            option = entrada.nextInt();
            if (option == 1) {
                System.out.println("Saldo atual do cliente: R$" + saldo);
            } else if (option == 2) {
                        System.out.print("Digite o valor a ser creditado [R$]: ");
                        deposito = entrada.nextDouble();
                        saldo += deposito;
                        System.out.println("Transação efetuada com sucesso!");
                        System.out.println("Saldo atualizado: R$" + saldo);
            } else if (option == 3) {
                    System.out.print("Digite o valor a ser debitado [R$]: ");
                    debito = entrada.nextDouble();

                    if (debito > saldo) {
                        System.out.println("Saldo insuficiente para a transação.");
                    } else {
                        saldo -= debito;
                        System.out.println("Transação efetuada com sucesso!");
                            System.out.println("Saldo atualizado: R$" + saldo);
                                    }
                        } else if (option != 4) {
                                    System.out.println("Opção inválida!");
                        }

            }
        }
}


