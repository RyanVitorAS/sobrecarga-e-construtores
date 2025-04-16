public class Carro {

    private String modelo;
    private int ano;
    private String marca;

    // Construtor 1: Apenas modelo
    public Carro(String modelo) {
        this.modelo = modelo;
        this.ano = 0;           // valor padrão
        this.marca = "Desconhecida";
    }

    // Construtor 2: Modelo e ano
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = "Desconhecida";
    }

    // Construtor 3: Modelo, ano e marca
    public Carro(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + (ano == 0 ? "Não informado" : ano));
        System.out.println("Marca: " + marca);
    }
}
