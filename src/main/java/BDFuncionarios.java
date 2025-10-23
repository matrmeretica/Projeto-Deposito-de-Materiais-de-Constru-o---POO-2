// Mateus Rodrigues Meretica - 2503700

import java.util.ArrayList;

public class BDFuncionarios {

    //MÉTODO SINGLETON
    private static BDFuncionarios bdFuncionariosUnico;

    private ArrayList<FuncionarioModel> listaFuncionarios;

    private BDFuncionarios() {
        listaFuncionarios = new ArrayList<>();
        popularDadosIniciaisFuncionarios();
    }

    //MÉTODO SINGLETON
    public static BDFuncionarios geraBDFuncionarios() {
        if (bdFuncionariosUnico == null) {
            bdFuncionariosUnico = new BDFuncionarios();
        }
        return bdFuncionariosUnico;
    }

    public FuncionarioModel insereFuncionario(FuncionarioModel funcionario) {
        if (consultaFuncionarioPorCpf(funcionario) == null && consultaFuncionarioPorMatricula(funcionario.getMatricula()) == null) {
            listaFuncionarios.add(funcionario);
            return funcionario;
        }
        return null;
    }

    public FuncionarioModel consultaFuncionarioPorCpf(FuncionarioModel funcionario) {
        for (FuncionarioModel f : listaFuncionarios) {
            if (f.getCpf().equals(funcionario.getCpf())) {
                return f;
            }
        }
        return null;
    }
    
    public FuncionarioModel consultaFuncionarioPorMatricula(int matricula) {
        for (FuncionarioModel f : listaFuncionarios) {
            if (f.getMatricula() == matricula) {
                return f;
            }
        }
        return null;
    }

    public ArrayList<FuncionarioModel> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public FuncionarioModel alteraFuncionario(FuncionarioModel funcionarioAtualizado) {
        FuncionarioModel funcionarioExistente = consultaFuncionarioPorCpf(funcionarioAtualizado);
        if (funcionarioExistente != null) {
            funcionarioExistente.setNome(funcionarioAtualizado.getNome());
            funcionarioExistente.setMatricula(funcionarioAtualizado.getMatricula());
            funcionarioExistente.setEnder(funcionarioAtualizado.getEnder());
            return funcionarioExistente;
        }
        return null;
    }

    public FuncionarioModel excluiFuncionario(FuncionarioModel funcionario) {
        FuncionarioModel funcionarioParaRemover = consultaFuncionarioPorCpf(funcionario);
        if (funcionarioParaRemover != null) {
            listaFuncionarios.remove(funcionarioParaRemover);
            return funcionarioParaRemover;
        }
        return null;
    }
    
    private void popularDadosIniciaisFuncionarios() {
        EnderecoModel endFunc1 = new EnderecoModel("Rua do Comércio", 50, "Cidade Teste", "SP");
        FuncionarioModel f1 = new FuncionarioModel("777888999", "Carlos Souza", endFunc1, 101);
        listaFuncionarios.add(f1);

        EnderecoModel endFunc2 = new EnderecoModel("Rua da Indústria", 75, "Outra Cidade", "MG");
        FuncionarioModel f2 = new FuncionarioModel("123456789", "Daniela Lima", endFunc2, 102);
        listaFuncionarios.add(f2);
        
        BDClientes clientesDB = BDClientes.geraBDClientes();
        if(!clientesDB.getListaClientes().isEmpty()){
            ClienteModel c1 = clientesDB.getListaClientes().get(0);
            if(c1 != null){
                c1.setVendedorResponsavel(f1);
            }
        }
    }
}