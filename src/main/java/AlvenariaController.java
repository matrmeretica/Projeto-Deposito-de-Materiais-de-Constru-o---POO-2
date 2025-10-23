//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class AlvenariaController extends MateriaisController {
    private AlvenariaModel model;
    private AlvenariaView view;

    public AlvenariaController(AlvenariaModel model, AlvenariaView view) {
        super(model, view);
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setTipoMaterial(String tipoMaterial) {
        model.setTipoMaterial(tipoMaterial);
    }
    
    public void setUnidadeMedida(String unidadeMedida) {
        model.setUnidadeMedida(unidadeMedida);
    }
    
    // Método para exibir a View
    public void exibirDetalhes() {
        view.exibirDetalhesAlvenaria(model);
    }

    // Lógica para conexão com o banco de dados (Comentada)
    public void salvarAlvenaria() {
        /*
        // Lógica para salvar a alvenaria no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO alvenaria (nome, codigo, valor, quantidade, tipo_material, unidade_medida) VALUES (?, ?, ?, ?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setString(1, model.getNome());
        // stmt.setInt(2, model.getCodigo());
        // stmt.setDouble(3, model.getValor());
        // stmt.setInt(4, model.getQuantidade());
        // stmt.setString(5, model.getTipoMaterial());
        // stmt.setString(6, model.getUnidadeMedida());
        // stmt.execute();
        */
        System.out.println("Material de alvenaria " + model.getNome() + " salvo com sucesso.");
    }
}