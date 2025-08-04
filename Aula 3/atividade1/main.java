public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Senhor dos Anéis", "Fantasia");
        
        Cliente cliente1 = new Cliente("João Pedro", 12345);
        
        Locacao locacao1 = new Locacao(filme1, cliente1);

        filme1.exibirDetalhes();
        System.out.println();
        cliente1.exibirDados();
        System.out.println();
        locacao1.realizarLocacao();
    }
}