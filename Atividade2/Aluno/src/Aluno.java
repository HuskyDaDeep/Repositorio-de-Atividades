public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private int idade;
    private int nota1;
    private int nota2;
    private int nota3;
    private boolean validacao;

    public Aluno(String nome, String matricula, String curso, int idade, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Matricula: " + matricula + ", Curso: " + curso + ", Idade: " + idade + ", Nota1: " + nota1 + ", Nota2: " + nota2 + ", Nota3: " + nota3 + ", Media: " + calcularMedia());
    }

    public void adicionarNota(int nota1, int nota2, int nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
    }

    public void adicionarNota(int nota1, int nota2, int nota3, boolean validacao) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.validacao = validacao;
    }
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void atualizar(String nome) {
        this.nome = nome;
    }
    public void atualizar(int idade) {
        this.idade = idade;
    }


}
