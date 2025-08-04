public class Aparelho {
    String nomeAparelho;
    double cargaAtual;

    public Aparelho(String novonomeAparelho, double novacargaAtual) {
        nomeAparelho = novonomeAparelho;
        cargaAtual = novacargaAtual;
    }

    public void usarAparelho() {
        System.out.println("Usando o aparelho " + nomeAparelho + " com carga de "
         + cargaAtual + " kg.");
    }

}
