public class Main {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Maria da Silva", 54321);
        Treino treino1 = new Treino("Peito e Tríceps", 60);
        Aparelho aparelho1 = new Aparelho("Supino Reto", 40.5);

      
        aluno1.exibirDados();
        System.out.println();
        treino1.iniciarTreino();
        System.out.println();
        aparelho1.usarAparelho();
    }
}