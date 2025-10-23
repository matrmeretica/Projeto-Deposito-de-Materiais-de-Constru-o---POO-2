//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class EnderecoController {
    private EnderecoModel model;
    private EnderecoView view;

    public EnderecoController(EnderecoModel model, EnderecoView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setRua(String rua) {
        model.setRua(rua);
    }

    public void setNumero(int numero) {
        model.setNumero(numero);
    }
    
    public void setCidade(String cidade) {
        model.setCidade(cidade);
    }
    
    public void setEstado(String estado) {
        model.setEstado(estado);
    }

    // Método para exibir a View
    public void exibirEndereco() {
        view.exibirEndereco(model);
    }
    
    // Lógica para conexão com o banco de dados (Comentada)
    public void salvarEndereco() {
        /*
        // Lógica para salvar os dados do endereço no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO enderecos (rua, numero, cidade, estado) VALUES (?, ?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setString(1, model.getRua());
        // stmt.setInt(2, model.getNumero());
        // stmt.setString(3, model.getCidade());
        // stmt.setString(4, model.getEstado());
        // stmt.execute();
        */
        System.out.println("Endereço salvo com sucesso: " + model.getRua());
    }
}