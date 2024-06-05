public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe ", "Jonas","Julia"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("No indice "+ x +" esta: "+ alunos[x]);
        }
        
        // For each
        for ( String aluno : alunos){
            System.out.println("Nome do aluno: " + aluno);
        }
    }
    
}
