public class Filme {
    String titulo;
    String genero;

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Filme:");
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
    }
}