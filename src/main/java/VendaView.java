//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class VendaView {
    public void exibirVenda(VendaModel venda) {
        System.out.println("--- Detalhes da Venda ---");
        System.out.println("Nota Fiscal: " + venda.getNotaFiscal());
        System.out.println("Data: " + venda.getData());
        if (venda.getCliente() != null) {
            System.out.println("Cliente: " + venda.getCliente().getNome());
        }
        if (venda.getFuncionario() != null) {
            System.out.println("Vendedor: " + venda.getFuncionario().getNome());
        }
        System.out.println("Total: R$" + String.format("%.2f", venda.getTotal()));
        System.out.println("-------------------------");
    }
}