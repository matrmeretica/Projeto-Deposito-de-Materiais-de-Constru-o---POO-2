//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class FerragensView extends MateriaisView {
    public void exibirDetalhesFerragens(FerragensModel ferragens) {
        super.exibirDetalhesMaterial(ferragens);
        System.out.println("Tipo de Metal: " + ferragens.getTipoMetal());
        System.out.println("Uso: " + ferragens.getUso());
        System.out.println("----------------------------");
    }
}