public class Locacao {
    Filme filmeAlugado;
    Cliente clienteLocacao;

    public Locacao(Filme filmeAlugado, Cliente clienteLocacao) {
        this.filmeAlugado = filmeAlugado;
        this.clienteLocacao = clienteLocacao;
    }

    public void realizarLocacao() {
        System.out.println("Locação Realizada");
        System.out.println("Cliente: " + clienteLocacao.nome);
        System.out.println("Filme Alugado: " + filmeAlugado.titulo);
        System.out.println("  ");
    }
}