public class Filme {
    String Titulo;
    String Genero;

    public Filme(String titulo, String genero) {
        Titulo = titulo;
        Genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Filme:");
        System.out.println("Título: " + Titulo);
        System.out.println("Gênero: " + Genero);
    }

}
