package Operadores;

public class OperadorTernario2 {
    public static void main(String[]args){
        String nomeUm = "YTALLO";
        String nomeDois = new String("YTALLO");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 2;
        int numero2 = 2;
        
        boolean simNão = numero1 == numero2;
        
        String igual = numero1 == numero2 ?"Sim" : "Não";
        System.out.println("O primeiro numero é igual ao segundo numero? " + igual);

        String diferente = numero1 != numero2 ?"Sim" : "Não";
        System.out.println("numero Um é diferente de numero Dois? " + diferente);

        if (numero1 > numero2 ) { // É executado caso nossa condição for verdadeira
         System.out.println("A Nossa Condição é verdadeira");       
        } 
    }
    
}
