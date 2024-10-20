import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int nmrConta = sc.nextInt();

        System.out.println("Digite o número da sua agência com o dígito: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Insira seu saldo autal: ");
        float saldo = sc.nextFloat();

        sc.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, nmrConta, saldo);
    }

}
