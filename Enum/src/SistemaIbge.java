// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro

// e = viravel (Só pra não ter duvidas dps)
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro e: EstadoBrasileiro.values() ) {
		   System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro eSelecionado = EstadoBrasileiro.SAO_PAULO;
		
        System.out.println(eSelecionado.getNome());
        System.out.println(eSelecionado.getSigla());
        System.out.println(eSelecionado.getNomeMaiusculo());
        System.out.println(eSelecionado.getibge());
	}
}
