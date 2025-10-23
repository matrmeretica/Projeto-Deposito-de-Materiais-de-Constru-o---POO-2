//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class VendaController {
    private VendaModel model;
    private VendaView view;

    public VendaController(VendaModel model, VendaView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setCliente(ClienteModel cliente) {
        model.setCliente(cliente);
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        model.setFuncionario(funcionario);
    }

    public void setItens(ItensModel[] itens) {
        model.setItens(itens);
    }
    
    public void setNf(String nf) {
        model.setNf(nf);
    }
    
    public void setData(String data) {
        model.setData(data);
    }

    // Método para exibir a View
    public void exibirVenda() {
        view.exibirVenda(model);
    }
    
    // Método para finalizar a venda com lógica de verificação de estoque
    public void finalizarVenda() {
        try {
            if (model.getItens() != null) {
                // Simula a verificação do estoque antes de finalizar a venda
                for (ItensModel item : model.getItens()) {
                    if (item != null) {
                        // Supondo um estoque disponível para cada material
                        int estoqueDisponivel = 100; // Valor de exemplo
                        item.verificarEstoque(estoqueDisponivel);
                    }
                }
            }
            
            // Lógica para salvar a venda no banco de dados (Comentada)
            /*
            // Exemplo de código de persistência
            // String sql = "INSERT INTO vendas (nf, data, total, cliente_cpf, funcionario_cpf) VALUES (?, ?, ?, ?, ?)";
            // PreparedStatement stmt = conexao.prepareStatement(sql);
            // stmt.setString(1, model.getNotaFiscal());
            // stmt.setString(2, model.getData());
            // stmt.setDouble(3, model.getTotal());
            // stmt.setInt(4, model.getCliente().getCpf());
            // stmt.setInt(5, model.getFuncionario().getCpf());
            // stmt.execute();
            */
            System.out.println("Venda finalizada com sucesso. Nota Fiscal: " + model.getNotaFiscal());
            exibirVenda(); // Exibe a venda após a finalização
            
        } catch (EstoqueInsufException e) {
            System.err.println("Erro ao finalizar a venda: " + e.getMessage());
        }
    }
}