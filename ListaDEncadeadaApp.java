import estruturas.ExercicioIterador;
import estruturas.ListaDEncadeada;

public class ListaDEncadeadaApp {
    
    public static void main(String[] args) {
        ListaDEncadeada lista = new ListaDEncadeada();
        ExercicioIterador iterador = lista.getIterador();
        
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

        System.out.println("Número de nós na lista: " + lista.contarNos());

        System.out.println("-----");

        lista.adicionarAoFinal(77);

        lista.mostrarNos();

        System.out.println("Número de nós na lista: " + lista.contarNos());

        System.out.println("-----");

        lista.inserirAposValor(12, 77);

        lista.mostrarNos();
        
        System.out.println("Número de nós na lista: " + lista.contarNos());

       
    }
}



