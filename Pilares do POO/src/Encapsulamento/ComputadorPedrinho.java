package Encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMenssenger msn = new MSNMenssenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        FacebookMenssenger fcb = new FacebookMenssenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
