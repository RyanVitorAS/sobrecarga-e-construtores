public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("\nProduto: " + nome);
        System.out.println("\nPreço: R$" + preco);
        System.out.println("\nQuantidade: " + quantidade);
    }
}


