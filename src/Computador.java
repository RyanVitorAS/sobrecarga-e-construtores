public class Computador {
    private String marca;
    private String modelo;
    private double preco;
    private int ano;

    // Construtor 1 - Todos os atributos
    public Computador(String marca, String modelo, double preco, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }

    // Construtor 2 - Marca e modelo
    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = 0.0;
        this.ano = 0;
    }

    // Construtor 3 - Apenas marca
    public Computador(String marca) {
        this.marca = marca;
        this.modelo = "Modelo desconhecido";
        this.preco = 0.0;
        this.ano = 0;
    }

    // Método para exibir as informações do computador
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + (preco == 0.0 ? "?" : "R$" + preco));
        System.out.println("Ano: " + (ano == 0 ? "Desconhecido" : ano));
        System.out.println("--------------------------");
    }
}