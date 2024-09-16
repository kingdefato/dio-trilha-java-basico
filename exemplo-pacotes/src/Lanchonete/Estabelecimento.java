package Lanchonete;

import Lanchonete.Area.Cliente.Cliente;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Cozinha.Cozinheiro;

public class Estabelecimento {
      public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();


        Atendente atendente = new Atendente();

        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer
      
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        /*não deveria, mas o estabelecimento ainda não definiu
         * normas de atendimento/
         */

         //esta ação é sigilosa, poderia ser privada
         cliente.consultarSaldoAplicativo();

      
      }
}
