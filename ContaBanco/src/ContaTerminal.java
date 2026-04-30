
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Criando o objeto scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Lendo o número da conta (Inteiro)
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        
        // Consumindo a quebra de linha que sobra após o nextInt()
        scanner.nextLine();

        // Lendo a agência (Texto)
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Lendo o nome do cliente (Texto)
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        // Lendo o saldo (Decimal)
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();

        // Concatenando as informações na mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibindo a mensagem final
        System.out.println(mensagem);

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
