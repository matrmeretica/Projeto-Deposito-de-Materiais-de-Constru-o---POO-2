//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class EnderecoModel {
    private String rua;
    private int numero;
    private String cidade;
    private String estado;

    public EnderecoModel() { // Construtor Default
        rua = "";
        numero = 0;
        cidade = "";
        estado = "";
    }

    public EnderecoModel(String rua, int numero, String cidade, String estado) { // Construtor Sobrecarregado
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}