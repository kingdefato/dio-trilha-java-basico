public class ExemploForArray {
    public static void main(String[] args) {

        //Em arrays o indice de elementos inicia em 0
        String alunos [] = {"FELIPE", "JONAS", "JULIO", "MARCOS"};

        //length = tamanho
        for(int x=0; x<alunos.length; x++){
            System.out.println("O Aluno no indice x=" + x + " é "  + alunos [x]);;
        }



        // Outra forma mais agradavel

        // : = a cada execução a variavel aluno ira obter um novo valor.

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }


    }
}
