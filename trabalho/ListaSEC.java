public class ListaSEC {
    Celula head;
    
    public ListaSEC () {
        head = new Celula(-1);
        head.prox = head;
    }
    public boolean empty(){
        return (head.prox == head);
    }
    public void inserirNoFinal ( Celula c) {
        if (empty()) {
            head.prox = c;
            c.prox = head;
         }else {
            Celula aux = head.prox;
            while (aux.prox != head){
                aux = aux.prox;
            }
            aux.prox = c;
            c.prox = head;
         }
    }
    public void inserirNoInicio (Celula c ){
        Celula aux = head.prox;
        head.prox = c;
        c.prox = aux;
    }
    public Celula pesquisar(int v) {
        if (empty()) {
            return null;
        } else {
            Celula aux = head.prox;
            while (aux != head && aux.valor != v) {
                aux = aux.prox;
            }
            if (aux == head) {
                return null; // Se não encontrou o valor, retorna null
            } else {
                return aux; // Retorna a célula onde encontrou o valor
            }
        }
    }

}

