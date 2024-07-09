public class Main {
    public static void main(String[] args) {
        
        Celula c1 = new Celula(10);
        Celula c2 = new Celula(20);
        Celula c3 = new Celula(30);

        ListaSE numeros = new ListaSE();
    
        numeros.inserirNoInicio(c1);
        numeros.inserirNoFim(c2);
        numeros.inserirNoInicio(c3);
        numeros.printer();


        Celula encontrada = lista.pesquisar(20);
        if (encontrada != null) {
            System.out.println("Valor encontrado: " + encontrada.valor);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}
