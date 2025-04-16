public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    // Construtor 1 - Todos os dados
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Construtor 2 - Apenas título e autor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = 0; // ano desconhecido
    }

    // Construtor 3 - Apenas título
    public Livro(String titulo) {
        this.titulo = titulo;
        this.autor = "Autor desconhecido";
        this.ano = 0;
    }

    // Método para exibir informações do livro
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + (ano == 0 ? "Desconhecido" : ano));
        System.out.println("--------------------------");
    }
}
