package Operadores;

public class OperadorLogico {
    public static void main (String []args){
        boolean condição1 = true;
        boolean condição2 = false;

        if (condição1 && (7 > 4  )){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condição1 && condição2){
            System.out.println("As duas condições são verdadeiras");
        }


        if(condição1 || condição2){
            System.out.println("Uma das  condições são verdadeiras");
        }



        System.out.println("fim");
    }
    
}
