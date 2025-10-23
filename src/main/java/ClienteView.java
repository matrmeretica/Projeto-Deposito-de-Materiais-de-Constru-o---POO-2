//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class ClienteView {
    public String exibirDados(ClienteModel cliente) {
        String dadosPessoa = "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf();
        String dadosCliente = "\nID: " + cliente.getId() +
                (cliente.getVendedorResponsavel() != null ? "\nAtendido por: " + cliente.getVendedorResponsavel().getNome() : "");
        return dadosPessoa + dadosCliente;
    }
}