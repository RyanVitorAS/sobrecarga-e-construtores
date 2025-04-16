public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    // Construtor 1: nome e salário (obrigatórios)
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = "Não informado"; // valor padrão
    }

    // Construtor 2: nome, salário e cargo (sobrecarga)
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário: R$%.2f\n", salario);
        System.out.println("Cargo: " + cargo);
    }
}
