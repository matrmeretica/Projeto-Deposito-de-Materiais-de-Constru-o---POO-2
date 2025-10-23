//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class CarpintariaModel extends MateriaisModel {
    private String tipoMadeira;
    private double espessura;

    public CarpintariaModel() { // Construtor Default
        super();
        tipoMadeira = "";
        espessura = 0.0;
    }

    public CarpintariaModel(String nome, int codigo, double valor, String tipoMadeira, double espessura) { // Construtor Sobrecarregado
        super(nome, codigo, valor); 
        this.tipoMadeira = tipoMadeira;
        this.espessura = espessura;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }

    public double getEspessura() {
        return espessura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
}