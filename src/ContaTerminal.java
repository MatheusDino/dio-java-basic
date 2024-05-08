import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scany = new Scanner(System.in);
        int numeroConta;
        int numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá, para abrir sua conta, por favor informe alguns dados; \n");
        
        System.out.println("Por favor, digite o número da agência ! ");
        numeroAgencia = scany.nextInt();

        System.out.println("Por favor, digite o número da conta ! ");
        numeroConta = scany.nextInt();

        System.out.println("Por favor, digite o nome do cliente ! ");
        nomeCliente = scany.next();

        System.out.println("Por favor, digite o saldo ! ");
        scany.nextLine();
        saldo = scany.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua Agência é %s, Conta %s e seu saldo %s já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldo);
    }
}