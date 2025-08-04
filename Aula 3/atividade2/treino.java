public class Treino {
    String nomeTreino;
    int duracaoMinutos;

    public Treino(String novonomeTreino, int novaduracaoMinutos) {
        nomeTreino = novonomeTreino;
        duracaoMinutos = novaduracaoMinutos;
    }

    public void iniciarTreino() {
        System.out.println("Iniciando treino de " + nomeTreino + " com duração " + duracaoMinutos + " minutos.");
    }

}
