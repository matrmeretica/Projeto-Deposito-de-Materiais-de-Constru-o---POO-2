//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class FuncionarioModel extends PessoaModel {
    private int matricula;

    public FuncionarioModel() { // Construtor Default
        super();
        matricula = 0;
    }

    public FuncionarioModel(String cpf, String nome, EnderecoModel ender, int matricula) { // Construtor Sobrecarregado
        super(cpf, nome, ender);
        System.out.println("\nConstrutor Sobrec -1 de Funcionario");
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}