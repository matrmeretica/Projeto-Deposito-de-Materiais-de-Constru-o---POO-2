// Mateus Rodrigues Meretica - 2503700

import java.util.ArrayList;

public class BDClientes {
    
    //MÉTODO SINGLETON
    private static BDClientes bdClientesUnico;

    private ArrayList<ClienteModel> listaClientes;

    private BDClientes() {
        listaClientes = new ArrayList<>();
        
        popularDadosIniciaisClientes(); 
    }

    //MÉTODO SINGLETON
    public static BDClientes geraBDClientes() {
        if (bdClientesUnico == null) {
            bdClientesUnico = new BDClientes();
        }
        return bdClientesUnico;
    }

    public ClienteModel insereCliente(ClienteModel cliente) {
    // Certifique-se de que consultaClientePorId aceita e é chamada com String:
    if (consultaClientePorCpf(cliente) == null && consultaClientePorId(cliente.getId()) == null) { 
        listaClientes.add(cliente);
        return cliente;
    }
    return null;
}

    public ClienteModel consultaClientePorCpf(ClienteModel cliente) {
        for (ClienteModel c : listaClientes) {
            // CORREÇÃO: Deve usar .equals() para comparar o conteúdo de Strings
            if (c.getCpf().equals(cliente.getCpf())) { 
                return c;
            }
        }
        return null;
    }

    public ClienteModel consultaClientePorId(String id) {
        for (ClienteModel c : listaClientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<ClienteModel> getListaClientes() {
        return listaClientes;
    }

    public ClienteModel alteraCliente(ClienteModel clienteAtualizado) {
        ClienteModel clienteExistente = consultaClientePorCpf(clienteAtualizado);
        if (clienteExistente != null) {
            clienteExistente.setNome(clienteAtualizado.getNome());
            clienteExistente.setEnder(clienteAtualizado.getEnder());
            clienteExistente.setVendedorResponsavel(clienteAtualizado.getVendedorResponsavel());
            return clienteExistente;
        }
        return null;
    }

    public ClienteModel excluiCliente(ClienteModel cliente) {
        ClienteModel clienteParaRemover = consultaClientePorCpf(cliente);
        if (clienteParaRemover != null) {
            listaClientes.remove(clienteParaRemover);
            return clienteParaRemover;
        }
        return null;
    }

    private void popularDadosIniciaisClientes() {
        EnderecoModel endCliente1 = new EnderecoModel("Rua das Flores", 100, "Cidade Teste", "SP");
        ClienteModel c1 = new ClienteModel("111222333", "Ana Silva", endCliente1, "1001", null);
        listaClientes.add(c1);

        EnderecoModel endCliente2 = new EnderecoModel("Av. Central", 250, "Outra Cidade", "MG");
        ClienteModel c2 = new ClienteModel("444555666", "Bruno Costa", endCliente2, "1002", null);
        listaClientes.add(c2);
    }
}
