//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class AlvenariaView extends MateriaisView {
    public void exibirDetalhesAlvenaria(AlvenariaModel alvenaria) {
        super.exibirDetalhesMaterial(alvenaria);
        System.out.println("Tipo de Material: " + alvenaria.getTipoMaterial());
        System.out.println("Unidade de Medida: " + alvenaria.getUnidadeMedida());
        System.out.println("----------------------------");
    }
}