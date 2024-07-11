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
}

