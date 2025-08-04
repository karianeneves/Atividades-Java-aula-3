public class Treino {
    String nomeTreino;
    int duracaoMinutos;

    public Treino(String nomeTreino, int duracaoMinutos) {
        this.nomeTreino = nomeTreino;
        this.duracaoMinutos = duracaoMinutos;
    }

    public void iniciarTreino() {
        System.out.println("Iniciando treino de " + nomeTreino + " com duração " + duracaoMinutos + " minutos.");
    }
}