public class Aluno {
    String nome;
    int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}