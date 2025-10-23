//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class ClienteModel extends PessoaModel {
    private String id;
    private FuncionarioModel vendedorResponsavel;

    public ClienteModel() { // Construtor Default
        super();
        id = "";
        vendedorResponsavel = null;
    }

    public ClienteModel(String cpf, String nome, EnderecoModel ender, String id, FuncionarioModel vendedorResponsavel) { // Construtor Sobrecarregado
        super(cpf, nome, ender);
        System.out.println("\nConstrutor Sobrec -1 de Cliente");
        this.id = id;
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FuncionarioModel getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(FuncionarioModel vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }
}