//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class MateriaisView {
    public void exibirDetalhesMaterial(MateriaisModel material) {
        System.out.println("--- Detalhes do Material ---");
        System.out.println("Nome: " + material.getNome());
        System.out.println("Código: " + material.getCodigo());
        System.out.println("Valor: R$" + String.format("%.2f", material.getValor()));
        System.out.println("Quantidade em Estoque: " + material.getQuantidade());
        System.out.println("----------------------------");
    }
}