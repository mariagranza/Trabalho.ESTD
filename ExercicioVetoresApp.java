import estruturas.ExercicioVetores;

public class ExercicioVetoresApp {

    public static void main(String[] args) {
        ExercicioVetores vetor = new ExercicioVetores(10);

        vetor.adicionar(2);
        vetor.adicionar(7);
        vetor.adicionar(9);
        vetor.adicionar(12);
        vetor.adicionar(16);
        vetor.adicionar(21);
        vetor.adicionar(27);
        vetor.adicionar(33);
        vetor.adicionar(42);
        vetor.adicionar(54);

        vetor.mostrarElementos();

        vetor.buscar(18);

        vetor.adicionarNoInicio(18);

        vetor.mostrarElementos();

        vetor.buscar(18);
        
        vetor.mostrarElementos();

    }
}