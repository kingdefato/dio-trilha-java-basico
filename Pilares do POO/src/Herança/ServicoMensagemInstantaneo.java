package Herança;

public class ServicoMensagemInstantaneo {
    public void enviarMensagem (){
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    //metodos privadas, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
