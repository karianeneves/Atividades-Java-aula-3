public class Aparelho {
    String nomeAparelho;
    double cargaAtual;

    public Aparelho(String nomeAparelho, double cargaAtual) {
        this.nomeAparelho = nomeAparelho;
        this.cargaAtual = cargaAtual;
    }

    public void usarAparelho() {
        System.out.println("Usando o aparelho " + nomeAparelho + " com carga de " + cargaAtual + " kg.");
    }
}