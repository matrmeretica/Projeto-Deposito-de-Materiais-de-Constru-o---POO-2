//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class VendaModel implements Calculavel {
    private ClienteModel cliente;
    private FuncionarioModel funcionario;
    private ItensModel[] itens;
    private String nf;
    private String data;
    private double total;

    public VendaModel() { // Construtor Default
        cliente = null;
        funcionario = null;
        itens = null;
        nf = "";
        data = "";
        total = 0.0;
    }

    public VendaModel(ClienteModel cliente, FuncionarioModel funcionario, ItensModel[] itens, String nf, String data) { // Construtor Sobrecarregado
        System.out.println("\nConstrutor Sobrec -1 de Venda");
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.itens = itens;
        this.nf = nf;
        this.data = data;
        calcularTotal();
    }

    private void calcularTotal() {
        this.total = calcular();
    }

    // Sobrescrita do método da interface
    public double calcular() { // sobrecarga
        double soma = 0;
        if (itens != null) {
            for (ItensModel item : itens) {
                if (item != null) {
                    soma += item.calcular();
                }
            }
        }
        return soma;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) { // sobrecarga
        this.cliente = cliente;
    }

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) { // sobrecarga
        this.funcionario = funcionario;
    }

    public ItensModel[] getItens() {
        return itens;
    }

    public void setItens(ItensModel[] itens) { // sobrecarga
        this.itens = itens;
        calcularTotal();
    }

    public String getNotaFiscal() {
        return nf;
    }

    public void setNf(String nf) { // sobrecarga
        this.nf = nf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) { // sobrecarga
        this.data = data;
    }

    public double getTotal() { // sobrecarga
        return total;
    }
}