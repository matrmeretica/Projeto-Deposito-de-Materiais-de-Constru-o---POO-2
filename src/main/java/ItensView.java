//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class ItensView {
    public void exibirItem(ItensModel item) {
        System.out.println("--- Detalhes do Item ---");
        System.out.println("Material: " + item.getMaterial().getNome());
        System.out.println("Quantidade: " + item.getQuantidade());
        System.out.println("Subtotal: R$" + String.format("%.2f", item.getSubtotal()));
        System.out.println("------------------------");
    }
}