//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class ItensModel implements Calculavel {
    private MateriaisModel material;
    private int quantidade;
    private double subtotal;

    public ItensModel() { // Construtor Default
        material = null;
        quantidade = 0;
        subtotal = 0.0;
    }

    public ItensModel(MateriaisModel material, int quantidade) { // Construtor Sobrecarregado
        this.material = material;
        this.quantidade = quantidade;
        this.subtotal = calcular(); // usa o método da interface
    }

    public MateriaisModel getMaterial() {
        return material;
    }

    public void setMaterial(MateriaisModel material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    // Sobrescrita: calcula o subtotal do item
    public double calcular() {
        return material.getValor() * quantidade;
    }

    public void verificarEstoque(int estoqueDisponivel) throws EstoqueInsufException {
        if (quantidade > estoqueDisponivel) {
            throw new EstoqueInsufException("Estoque insuficiente para o item: " + material.getNome());
        }
    }
}