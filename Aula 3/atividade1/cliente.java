public class Cliente {
    String Nome;
    int Id;

    public Cliente(String nome, int id) {
        Nome = nome;
        Id = id;
    }

    public void exibirDados() {
        System.out.println("Detalhes do Cliente:");
        System.out.println("Nome: " + Nome);
        System.out.println("ID: " + Id);
    }

}
