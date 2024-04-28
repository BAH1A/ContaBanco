import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem-vindo ao UniBank!");
        System.out.println("Para a abertura da sua conta, precisarei das seguintes informações:");
        System.out.println("Qual seu nome? Pode digitar por favor.");
        String nomeCliente = scanner.next();

        System.out.println("E o seu sobrenome?");
        String sobrenomeCliente = scanner.next();

        System.out.println("Maravilha " + nomeCliente + ", nosso atendimento informou-lhe seus dados bancários, eu vou precisar saber o número da sua agência, ele possui 4 digítos. Poderia me informar?");
        int agenciaConta = scanner.nextInt();

        System.out.println("Agora o numero da sua conta, ele possuí 6 digítos.");
        int numeroConta = scanner.nextInt();

        System.out.println("Ótimo! Estamos quase lá, por fim, preciso saber o valor do seu depósito inicial. Qual seria a quantia?");
        double saldoConta = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Aguarde... Analisando as informações...");
        System.out.println(nomeCliente +", obrigado aguardar. Sua conta na Unibank foi criada com sucesso! Segue seus dados bancários:");
        System.out.println( " \n Nome:" + nomeCliente +" " + sobrenomeCliente + ". \n Sua agência é: " + agenciaConta + ". Conta: " + numeroConta + ".\n Seu saldo: R$" + saldoConta + ". \n");
        System.out.println("Se desejar, o valor depositado já está disponível para saque.");
    }
}