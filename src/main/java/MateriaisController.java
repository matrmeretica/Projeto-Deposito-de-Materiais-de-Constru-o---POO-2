//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class MateriaisController {
    private MateriaisModel model;
    private MateriaisView view;

    public MateriaisController(MateriaisModel model, MateriaisView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setNome(String nome) {
        model.setNome(nome);
    }

    public void setCodigo(int codigo) {
        model.setCodigo(codigo);
    }
    
    public void setValor(double valor) throws PrecoInvalException {
        model.setValor(valor);
    }

    public void setQuantidade(int quantidade) {
        model.setQuantidade(quantidade);
    }

    // Método para exibir a View
    public void exibirDetalhes() {
        view.exibirDetalhesMaterial(model);
    }
    
    // Lógica para conexão com o banco de dados (Comentada)
    public void salvarMaterial() {
        /*
        // Lógica para salvar o material no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO materiais (nome, codigo, valor, quantidade) VALUES (?, ?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setString(1, model.getNome());
        // stmt.setInt(2, model.getCodigo());
        // stmt.setDouble(3, model.getValor());
        // stmt.setInt(4, model.getQuantidade());
        // stmt.execute();
        */
        System.out.println("Material " + model.getNome() + " salvo com sucesso.");
    }
}