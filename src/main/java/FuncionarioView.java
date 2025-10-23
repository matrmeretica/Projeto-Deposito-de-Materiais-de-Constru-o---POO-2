//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class FuncionarioView {
    public String exibirDados(FuncionarioModel funcionario) {
        return "Nome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf() + "\nMatrícula: " + funcionario.getMatricula();
    }
}