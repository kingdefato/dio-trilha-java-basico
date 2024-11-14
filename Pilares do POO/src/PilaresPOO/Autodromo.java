package PilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123134645");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("8276898");
        z400.ligar();
        
        Veiculo coringa = z400;

        coringa.ligar();
    }
   
}
