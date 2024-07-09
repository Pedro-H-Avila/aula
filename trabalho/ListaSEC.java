public class ListaSEC {
    Celula = head;
    
    public ListaSEC () {
        head = new Celula(-1);
        head.prox = cabeça;
    }
    public boolean empty(){
        return (head.prox == head);
    }
    public void inserirNoFinal ( Celula c) [
        if (empty()) {
            head.prox = c;
            c.prox = head;
         }
    ]
}

