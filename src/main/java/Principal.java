//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class Principal {

    public static void main(String[] args) {
        BDClientes.geraBDClientes();
        BDFuncionarios.geraBDFuncionarios();
        BDEstoque.geraBDEstoque();
        BDVendas.geraBDVendas();
        java.awt.EventQueue.invokeLater(() -> FormPrincipal.geraFormPrincipal().setVisible(true));
    }
}