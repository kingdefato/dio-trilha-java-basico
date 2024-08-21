package Operadores;

public class Concatenacao {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        
        String concatenacao = "?";
        
        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
        
    }
}
