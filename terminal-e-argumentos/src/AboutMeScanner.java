import java.util.Scanner;
import java.util.Locale;

public class AboutMeScanner {
    public static void main(String[] args) {
       try{
        //Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


    System.out.println("Olá, me chamo "+ nome.toUpperCase() +" " + sobrenome+ "\n" + "Minha Altura é " + altura+"cm"+ "\n" +"Minha idade é " + idade);
       }catch (InputMismatchException e){
        System.out.println("Os Campos idade e altura precisam ser númericos!");
       }

    }
}
