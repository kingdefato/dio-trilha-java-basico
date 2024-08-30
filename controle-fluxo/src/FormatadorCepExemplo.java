public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcecao e) {
            System.out.println("O cep nao corresponde com as regras de negocio");
        }
    }
        static String formatarCep(String cep) throws CepInvalidoExcecao{
            if(cep.length()!=8 )
            throw new CepInvalidoExcecao();

            //simulando cep formatado
            return "23.765-064";

        }
    }
