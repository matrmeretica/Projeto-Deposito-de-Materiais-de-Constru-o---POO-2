//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class PessoaController {
    private PessoaModel model;
    private PessoaView view;

    public PessoaController(PessoaModel model, PessoaView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para atualizar o model
    public void setCpf(String cpf) {
        model.setCpf(cpf);
    }

    public void setNome(String nome) {
        model.setNome(nome);
    }
    
    public void setNome(String nome, boolean maiusculo) {
        model.setNome(nome, maiusculo);
    }

    // Método para exibir a view
    public String exibirDados() {
        return view.exibirDados(model);
    }

    // Lógica para conexão com o banco de dados (Comentada)
    public void salvarPessoa() {
        /*
        // Aqui seria a lógica para salvar a pessoa no banco de dados
        try {
            // Código de conexão e inserção no banco de dados
        } catch (SQLException e) {
            // Lidar com exceções de SQL
        }
        */
        System.out.println("Pessoa salva (simulação): " + model.getNome());
    }
}