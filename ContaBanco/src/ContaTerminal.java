import java.util.Scanner;  // Importando a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando e lendo os dados do usuário
        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        // Exibindo a mensagem final com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +
                           saldo + " já está disponível para saque.");

        // Fechar o scanner após o uso
        scanner.close();
    }
}
