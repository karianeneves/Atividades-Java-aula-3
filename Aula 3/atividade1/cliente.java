public class Cliente {
    String nome;
    int id;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void exibirDados() {
        System.out.println("Detalhes do Cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
    }
}