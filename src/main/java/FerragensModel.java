//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class FerragensModel extends MateriaisModel {
    private String tipoMetal;
    private String uso;

    public FerragensModel() { // Construtor Default
        super();
        tipoMetal = "";
        uso = "";
    }

    public FerragensModel(String nome, int codigo, double valor, String tipoMetal, String uso) throws PrecoInvalException {
        super(nome, codigo, valor);
        this.tipoMetal = tipoMetal;
        this.uso = uso;
    }

    public String getTipoMetal() {
        return tipoMetal;
    }

    public void setTipoMetal(String tipoMetal) {
        this.tipoMetal = tipoMetal;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
}