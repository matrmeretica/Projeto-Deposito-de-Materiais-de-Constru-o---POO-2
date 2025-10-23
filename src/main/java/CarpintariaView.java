//Lucas Raphael, 2525518 - Mateus Rodrigues, 2503700 - Norberto Junior, 2209136

public class CarpintariaView extends MateriaisView {
    public void exibirDetalhesCarpintaria(CarpintariaModel carpintaria) {
        super.exibirDetalhesMaterial(carpintaria);
        System.out.println("Tipo de Madeira: " + carpintaria.getTipoMadeira());
        System.out.println("Espessura: " + carpintaria.getEspessura() + " mm");
        System.out.println("----------------------------");
    }
}