//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class ClienteController {
    private ClienteModel model;
    private ClienteView view;

    public ClienteController(ClienteModel model, ClienteView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setCpf(String cpf) {
        model.setCpf(cpf);
    }
    
    public String getCpf() {
        return model.getCpf();
    }
    
    public void setNome(String nome) {
        model.setNome(nome);
    }
    
    public String getNome() {
        return model.getNome();
    }

    public void setId(String id) {
        model.setId(id);
    }
    
    public String getId() {
        return model.getId();
    }

    public void setVendedorResponsavel(FuncionarioModel vendedorResponsavel) {
        model.setVendedorResponsavel(vendedorResponsavel);
    }
    
    public FuncionarioModel getVendedorResponsavel() {
        return model.getVendedorResponsavel();
    }

    // Método para exibir a View
    public String exibirDados() {
        return view.exibirDados(model);
    }

    // Lógica para conexão com o banco de dados (comentada)
    public void salvarCliente() {
        /*
        // Lógica para salvar os dados do cliente no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO clientes (cpf, nome, id, vendedor_responsavel_cpf) VALUES (?, ?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setInt(1, model.getCpf());
        // stmt.setString(2, model.getNome());
        // stmt.setInt(3, model.getId());
        // stmt.setInt(4, model.getVendedorResponsavel().getCpf());
        // stmt.execute();
        */
        System.out.println("Cliente " + model.getNome() + " salvo com sucesso.");
    }
}