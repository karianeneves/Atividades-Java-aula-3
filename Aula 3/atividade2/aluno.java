public class Aluno {
    String nome;
    int matricula;

    public Aluno(String nome, int matricula) {
        nome = nome;
        matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

}
