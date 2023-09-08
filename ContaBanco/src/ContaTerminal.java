import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{
    
        Scanner nomeId = new Scanner(System.in);
        System.out.println("Digite o seu nome completo, sem abreviação: ");
        String nome = nomeId.next();

        System.out.println("Obrigado pelo interesse em nosso banco, " + nome);

        Scanner numeroConta = new Scanner(System.in);
        System.out.println("Digite o número da conta, que deve ser composto por quatro números: ");
        int conta = numeroConta.nextInt();

        Scanner numeroAgencia = new Scanner(System.in);
        System.out.println("Digite o número da sua agência: ");
        int agencia = numeroAgencia.nextInt();

        Scanner valorSaldo = new Scanner(System.in);
        System.out.println("Qual o valor para depósito? ");
        double saldo = valorSaldo.nextDouble();


        System.out.println(nome + "seja bem-vindo ao Mar bank. O número da sua conta é " + conta + 
        " na agência: " + agencia + " e o seu saldo atual é de R$" + saldo);

    }
}
