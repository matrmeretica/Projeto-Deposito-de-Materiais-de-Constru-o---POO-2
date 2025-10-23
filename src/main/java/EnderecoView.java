//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class EnderecoView {
    public void exibirEndereco(EnderecoModel endereco) {
        System.out.println("--- Dados do Endereço ---");
        System.out.println("Rua: " + endereco.getRua() + ", Nº: " + endereco.getNumero());
        System.out.println("Cidade: " + endereco.getCidade() + ", Estado: " + endereco.getEstado());
        System.out.println("-------------------------");
    }
}