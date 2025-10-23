//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class FerragensController extends MateriaisController {
    private FerragensModel model;
    private FerragensView view;

    public FerragensController(FerragensModel model, FerragensView view) {
        super(model, view);
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setTipoMetal(String tipoMetal) {
        model.setTipoMetal(tipoMetal);
    }
    
    public void setUso(String uso) {
        model.setUso(uso);
    }
    
    // Método para exibir a View
    public void exibirDetalhes() {
        view.exibirDetalhesFerragens(model);
    }

    // Lógica para conexão com o banco de dados (Comentada)
    public void salvarFerragens() {
        /*
        // Lógica para salvar a ferragem no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO ferragens (nome, codigo, valor, quantidade, tipo_metal, uso) VALUES (?, ?, ?, ?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setString(1, model.getNome());
        // stmt.setInt(2, model.getCodigo());
        // stmt.setDouble(3, model.getValor());
        // stmt.setInt(4, model.getQuantidade());
        // stmt.setString(5, model.getTipoMetal());
        // stmt.setString(6, model.getUso());
        // stmt.execute();
        */
        System.out.println("Material de ferragens " + model.getNome() + " salvo com sucesso.");
    }
}