public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("João", "12345", "Engenharia", 20, 8, 7, 9);
        Aluno aluno2 = new Aluno("Maria", "67890", "Medicina", 22, 10, 9, 8);
        Aluno aluno3 = new Aluno("Pedro", "54321", "Direito", 21, 6, 7, 5);

        aluno1.adicionarNota(9, 8, 10);
        aluno2.adicionarNota(10, 9, 8);
        aluno3.adicionarNota(7, 6, 5, true);

        aluno1.atualizar("João Silva");
        aluno2.atualizar(23);
        
        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
    }
}
