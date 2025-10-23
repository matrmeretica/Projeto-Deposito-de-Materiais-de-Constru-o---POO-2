//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class AlvenariaModel extends MateriaisModel {
    private String tipoMaterial;
    private String unidadeMedida;

    public AlvenariaModel() { // Construtor Default
        super();
        tipoMaterial = "";
        unidadeMedida = "";
    }

    public AlvenariaModel(String nome, int codigo, double valor, String tipoMaterial, String unidadeMedida) { // Construtor Sobrecarregado
        super(nome, codigo, valor); 
        this.tipoMaterial = tipoMaterial;
        this.unidadeMedida = unidadeMedida;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}