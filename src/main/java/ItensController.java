//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class ItensController {
    private ItensModel model;
    private ItensView view;

    public ItensController(ItensModel model, ItensView view) {
        this.model = model;
        this.view = view;
    }

    // Métodos para interagir com o Model
    public void setMaterial(MateriaisModel material) {
        model.setMaterial(material);
    }

    public void setQuantidade(int quantidade) {
        model.setQuantidade(quantidade);
    }
    
    public double getSubtotal() {
        return model.getSubtotal();
    }
    
    // Método para exibir a View
    public void exibirItem() {
        view.exibirItem(model);
    }
    
    // Método para simular a adição de um item a uma venda, incluindo a verificação de estoque
    public void adicionarItemAVenda(int estoqueDisponivel) {
        try {
            model.verificarEstoque(estoqueDisponivel);
            // Lógica para salvar o item no banco de dados (Comentada)
            /*
            // Exemplo de código de persistência para o item
            // String sql = "INSERT INTO itens (material_id, quantidade, subtotal) VALUES (?, ?, ?)";
            // PreparedStatement stmt = conexao.prepareStatement(sql);
            // stmt.setInt(1, model.getMaterial().getId());
            // stmt.setInt(2, model.getQuantidade());
            // stmt.setDouble(3, model.getSubtotal());
            // stmt.execute();
            */
            System.out.println("Item adicionado à venda com sucesso.");
            
        } catch (EstoqueInsufException e) {
            System.err.println("Erro ao adicionar item: " + e.getMessage());
        }
    }
}