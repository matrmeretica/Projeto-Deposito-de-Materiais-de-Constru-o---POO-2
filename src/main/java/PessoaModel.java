//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public abstract class PessoaModel {
    private String cpf;
    private String nome;
    private EnderecoModel ender;

    public PessoaModel() { // Construtor Default
        cpf = "";
        nome = "";
        ender = new EnderecoModel();
    }

    public PessoaModel(String cpf, String nome, EnderecoModel ender) {  // Construtor Sobrecarregado
        System.out.println("\nConstrutor Sobrec -1 de Pessoa");
        this.cpf = cpf;
        this.nome = nome;
        this.ender = ender;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    // Sobrecarga
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobrecarga
    public void setNome(String nome, boolean maiusculo) {
        if (maiusculo) {
            this.nome = nome.toUpperCase();
        } else {
            this.nome = nome;
        }
    }

    public EnderecoModel getEnder() {
        return ender;
    }

    public void setEnder(EnderecoModel ender) {
        this.ender = ender;
    }
}