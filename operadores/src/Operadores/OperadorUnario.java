package Operadores;

public class OperadorUnario {

    public static void main(String[] args) throws Exception {

        int numero = 5;

        numero = -numero;
    
        System.out.println(numero);
    
        /*Forma errada de tornar um numero positivo: 
        numero = + numero

        =======================================================
        Forma certa:
        */
        numero = numero * -1;

        System.out.println(numero);
     }

 
}