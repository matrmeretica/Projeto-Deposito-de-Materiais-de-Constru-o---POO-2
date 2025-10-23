// Mateus Rodrigues Meretica - 2503700

import java.util.ArrayList;

public class BDVendas {

    //MÉTODO SINGLETON
    private static BDVendas bdVendasUnico;

    private ArrayList<VendaModel> listaVendas;

    private BDVendas() {
        listaVendas = new ArrayList<>();
        popularDadosIniciaisVendas();
    }

    //MÉTODO SINGLETON
    public static BDVendas geraBDVendas() {
        if (bdVendasUnico == null) {
            bdVendasUnico = new BDVendas();
        }
        return bdVendasUnico;
    }

    public VendaModel insereVenda(VendaModel venda) {
        if (consultaVendaPorNotaFiscal(venda.getNotaFiscal()) == null) {
            listaVendas.add(venda);
            return venda;
        }
        return null;
    }

    public VendaModel consultaVendaPorNotaFiscal(String notaFiscal) {
        for (VendaModel v : listaVendas) {
            if (v.getNotaFiscal().equals(notaFiscal)) {
                return v;
            }
        }
        return null;
    }

    public ArrayList<VendaModel> getListaVendas() {
        return listaVendas;
    }

    public VendaModel alteraVenda(VendaModel vendaAtualizada) {
        VendaModel vendaExistente = consultaVendaPorNotaFiscal(vendaAtualizada.getNotaFiscal());
        if (vendaExistente != null) {
            vendaExistente.setCliente(vendaAtualizada.getCliente());
            vendaExistente.setFuncionario(vendaAtualizada.getFuncionario());
            vendaExistente.setItens(vendaAtualizada.getItens());
            vendaExistente.setData(vendaAtualizada.getData());

            return vendaExistente; 
        }
        return null; 
    }

    // Exclusão (Delete)
    public VendaModel excluiVenda(String notaFiscal) {
        VendaModel vendaParaRemover = consultaVendaPorNotaFiscal(notaFiscal);
        if (vendaParaRemover != null) {
            listaVendas.remove(vendaParaRemover);
            return vendaParaRemover;
        }
        return null;
    }
    
    private void popularDadosIniciaisVendas() {
        BDClientes bdC = BDClientes.geraBDClientes();
        BDFuncionarios bdF = BDFuncionarios.geraBDFuncionarios();
        BDEstoque bdE = BDEstoque.geraBDEstoque();

        ClienteModel clienteExemplo = bdC.getListaClientes().get(0);
        FuncionarioModel funcionarioExemplo = bdF.getListaFuncionarios().get(0);
        MateriaisModel materialExemplo = bdE.getListaMateriais().get(0);

        if (clienteExemplo != null && funcionarioExemplo != null && materialExemplo != null) {
            ItensModel item1 = new ItensModel(materialExemplo, 5);
            try {
                item1.verificarEstoque(materialExemplo.getQuantidade());
                item1.setSubtotal(item1.calcular());

                ItensModel[] itensVenda = {item1};
                VendaModel vendaExemplo = new VendaModel(clienteExemplo, funcionarioExemplo, itensVenda, "NF001", "28/06/2025");
                insereVenda(vendaExemplo);
                System.out.println("Venda de exemplo NF001 populada.");
            } catch (EstoqueInsufException e) {
                System.err.println("Erro ao popular venda de exemplo: " + e.getMessage());
            }
        }
    }
}