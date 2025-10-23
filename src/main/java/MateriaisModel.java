//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public abstract class MateriaisModel {
    private String nome;
    private int codigo;
    private double valor;
    private int quantidade;

    public MateriaisModel() { // Construtor Default
        nome = "";
        codigo = 0;
        valor = 0.0;
        quantidade = 0;
    }

    public MateriaisModel(String nome, int codigo, double valor) { // Construtor Sobrecarregado
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    // Validação de preço com a exceção
    public void setValor(double valor) throws PrecoInvalException {
        if (valor <= 0) {
            throw new PrecoInvalException("Valor do material inválido!");
        }
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
    }
}