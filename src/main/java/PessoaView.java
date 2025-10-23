//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class PessoaView {

    public String exibirDados(PessoaModel pessoa) {
        return "Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf();
    }
}