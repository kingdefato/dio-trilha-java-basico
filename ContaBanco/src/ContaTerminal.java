import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args)throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Informe seu Saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+ nomeCliente + " "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência " + agencia + " ,conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
