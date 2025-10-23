//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class FuncionarioController {
    private FuncionarioModel model;
    private FuncionarioView view;

    public FuncionarioController(FuncionarioModel model, FuncionarioView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public String getCpf() {
        return model.getCpf();
    }

    public void setCpf(String cpf) {
        model.setCpf(cpf);
    }
    
    public String getNome() {
        return model.getNome();
    }

    public void setNome(String nome) {
        model.setNome(nome);
    }
    
    public int getMatricula() {
        return model.getMatricula();
    }
    
    public void setMatricula(int matricula) {
        model.setMatricula(matricula);
    }

    // Método para exibir a View
    public String exibirDados() {
        return view.exibirDados(model);
    }

    // Lógica para conexão com o banco de dados (comentada)
    public void salvarFuncionario() {
        /*
        // Lógica para salvar os dados do funcionário no banco de dados.
        // Exemplo:
        // String sql = "INSERT INTO funcionarios (cpf, nome, matricula) VALUES (?, ?, ?)";
        // PreparedStatement stmt = conexao.prepareStatement(sql);
        // stmt.setInt(1, model.getCpf());
        // stmt.setString(2, model.getNome());
        // stmt.setInt(3, model.getMatricula());
        // stmt.execute();
        */
        System.out.println("Funcionário " + model.getNome() + " salvo com sucesso.");
    }
}