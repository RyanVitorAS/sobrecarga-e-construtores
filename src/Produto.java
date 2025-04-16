public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("\n");
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$%.2f\n", preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor Total em Estoque: R$%.2f\n", preco * quantidade);
    }
}
