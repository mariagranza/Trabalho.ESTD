import estruturas.ExercicioIterador;
import estruturas.ListaDEncadeada;

public class ExercicioIteradorApp{
    public static void main(String[] args) {
        ListaDEncadeada lista = new ListaDEncadeada();
        
        
        lista.adicionarAoInicio(2);
        lista.adicionarAoInicio(7);
        lista.adicionarAoInicio(9);
        lista.adicionarAoInicio(12);
        lista.adicionarAoInicio(16);
        lista.adicionarAoInicio(21);
        lista.adicionarAoInicio(27);
        lista.adicionarAoInicio(33);
        lista.adicionarAoInicio(42);
        lista.adicionarAoInicio(54);

        lista.mostrarNos();

        ExercicioIterador iterador = lista.getIterador();

        iterador.avancar();
        iterador.avancar();
        iterador.inserirAposAtual(84);
        lista.mostrarNos();
        iterador.removerAposAtual();
        lista.mostrarNos();
        iterador.inserirAntesAtual(84);
        lista.mostrarNos();
        iterador.removerAntesAtual();
        lista.mostrarNos();
    }
}