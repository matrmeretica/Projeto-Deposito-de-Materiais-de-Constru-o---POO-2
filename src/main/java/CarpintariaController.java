//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class CarpintariaController extends MateriaisController {
    private CarpintariaModel model;
    private CarpintariaView view;

    public CarpintariaController(CarpintariaModel model, CarpintariaView view) {
        super(model, view);
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setTipoMadeira(String tipoMadeira) {
        model.setTipoMadeira(tipoMadeira);
    }
    
    public void setEspessura(double espessura) {
        model.setEspessura(espessura);
    }
    
    // Método para exibir a View
    public void exibirDetalhes() {
        view.exibirDetalhesCarpintaria(model);
    }

    // Lógica para conexão com o banco de dados (Comentada)
    public void salvarCarpintaria() {
        /*
        // Lógica para salvar a carpintaria no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO carpintaria (nome, codigo, valor, quantidade, tipo_madeira, espessura) VALUES (?, ?, ?, ?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setString(1, model.getNome());
        // stmt.setInt(2, model.getCodigo());
        // stmt.setDouble(3, model.getValor());
        // stmt.setInt(4, model.getQuantidade());
        // stmt.setString(5, model.getTipoMadeira());
        // stmt.setDouble(6, model.getEspessura());
        // stmt.execute();
        */
        System.out.println("Material de carpintaria " + model.getNome() + " salvo com sucesso.");
    }
}