import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite a agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número de sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$:" + saldo + " já está disponível para saque");
    }
}
