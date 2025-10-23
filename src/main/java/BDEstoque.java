// Mateus Rodrigues Meretica - 2503700

import java.util.ArrayList;

public class BDEstoque {

    //MÉTODO SINGLETON
    private static BDEstoque bdEstoqueUnico;

    private ArrayList<MateriaisModel> listaMateriais;

    private BDEstoque() {
        listaMateriais = new ArrayList<>();
        popularDadosIniciaisMateriais();
    }

    //MÉTODO SINGLETON
    public static BDEstoque geraBDEstoque() {
        if (bdEstoqueUnico == null) {
            bdEstoqueUnico = new BDEstoque();
        }
        return bdEstoqueUnico;
    }

    public MateriaisModel insereMaterial(MateriaisModel material) {
        if (consultaMaterialPorCodigo(material.getCodigo()) == null) {
            listaMateriais.add(material);
            return material;
        }
        return null;
    }

    public MateriaisModel consultaMaterialPorCodigo(int codigo) {
        for (MateriaisModel m : listaMateriais) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<MateriaisModel> getListaMateriais() {
        return listaMateriais;
    }

    public MateriaisModel alteraMaterial(MateriaisModel materialAtualizado) {
        MateriaisModel materialExistente = consultaMaterialPorCodigo(materialAtualizado.getCodigo());
        if (materialExistente != null) {
            try {
                materialExistente.setNome(materialAtualizado.getNome());
                materialExistente.setValor(materialAtualizado.getValor());
                materialExistente.setQuantidade(materialAtualizado.getQuantidade());

                if (materialExistente instanceof FerragensModel && materialAtualizado instanceof FerragensModel) {
                    ((FerragensModel) materialExistente).setTipoMetal(((FerragensModel) materialAtualizado).getTipoMetal());
                    ((FerragensModel) materialExistente).setUso(((FerragensModel) materialAtualizado).getUso());
                } else if (materialExistente instanceof AlvenariaModel && materialAtualizado instanceof AlvenariaModel) {
                    ((AlvenariaModel) materialExistente).setTipoMaterial(((AlvenariaModel) materialAtualizado).getTipoMaterial());
                    ((AlvenariaModel) materialExistente).setUnidadeMedida(((AlvenariaModel) materialAtualizado).getUnidadeMedida());
                } else if (materialExistente instanceof CarpintariaModel && materialAtualizado instanceof CarpintariaModel) {
                    ((CarpintariaModel) materialExistente).setTipoMadeira(((CarpintariaModel) materialAtualizado).getTipoMadeira());
                    ((CarpintariaModel) materialExistente).setEspessura(((CarpintariaModel) materialAtualizado).getEspessura());
                }

                return materialExistente;
            } catch (PrecoInvalException | IllegalArgumentException e) {
                System.err.println("Erro ao alterar material: " + e.getMessage());
                return null;
            }
        }
        return null;
    }

    public MateriaisModel excluiMaterial(int codigo) {
        MateriaisModel materialParaRemover = consultaMaterialPorCodigo(codigo);
        if (materialParaRemover != null) {
            listaMateriais.remove(materialParaRemover);
            return materialParaRemover;
        }
        return null;
    }
    
public MateriaisModel atualizaQuantidadeMaterial(int codigo, int novaQuantidade) {
    MateriaisModel materialExistente = consultaMaterialPorCodigo(codigo);
    if (materialExistente != null) {
        try {
            materialExistente.setQuantidade(novaQuantidade);
            return materialExistente;
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao atualizar quantidade: " + e.getMessage());
            return null;
        }
    }
    return null;
}

    private void popularDadosIniciaisMateriais() {
        try {
            FerragensModel ferragem1 = new FerragensModel("Parafuso Philips 5x20mm", 2001, 0.50, "Aço Carbono", "Fixação Geral");
            ferragem1.setQuantidade(500);
            listaMateriais.add(ferragem1);

            AlvenariaModel alvenaria1 = new AlvenariaModel("Cimento CP II E-32", 3001, 25.00, "Cimento", "Saco (50kg)");
            alvenaria1.setQuantidade(50);
            listaMateriais.add(alvenaria1);

            CarpintariaModel carpintaria1 = new CarpintariaModel("Madeira Pinus 2x4", 4001, 15.00, "Pinus", 5.0);
            carpintaria1.setQuantidade(100);
            listaMateriais.add(carpintaria1);
            
            FerragensModel ferragem2 = new FerragensModel("Prego 18x27", 2002, 0.10, "Aço Zincado", "Fixação Madeira");
            ferragem2.setQuantidade(1000);
            listaMateriais.add(ferragem2);

            AlvenariaModel alvenaria2 = new AlvenariaModel("Areia Média", 3002, 5.00, "Areia", "Saco (20kg)");
            alvenaria2.setQuantidade(200);
            listaMateriais.add(alvenaria2);

        } catch (PrecoInvalException e) {
            System.err.println("Erro ao popular dados de materiais (Preço): " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao popular dados de materiais (Quantidade): " + e.getMessage());
        }
    }
}