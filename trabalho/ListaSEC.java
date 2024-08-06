public class ListaSEC {
    Celula head;
    
    public ListaSEC () {
        head = new Celula(-1);
        head.prox = head;
    }
    public boolean empty(){
        return (head.prox == head);
    }
//-------------------------------------------------------------------------------------------
    public void insertAtFinal ( Celula c) {
        if (c == null) {
            throw new illegalArgumentException (" Não é possivel inserir um avalor nulo!")
        }
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
//-------------------------------------------------------------------------------------------
    public void insertAtMiddle (Celula c ){
        if (c == null){
            throw new illegalArgumentException (" Não é possivel inserir um valor nulo!")
        }
        Celula aux = head.prox;
        head.prox = c;
        c.prox = aux;
    }
//-------------------------------------------------------------------------------------------
    public Celula search(int v) {
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
//-------------------------------------------------------------------------------------------
        public boolean removeFromStart(){
            if(vazia()){
                return false;
            }else {
                Celula aux = head.prox;
                if (aux.prox == head) {
                    head.prox = head;
                }else {
                 aux.prox = null;
                 return true;
                }
            }
        }
//-------------------------------------------------------------------------------------------
    public boolean removeFinal(){
        if (empty()) {
            return false;
        }else {
            Celula aux = head.prox;
            if (aux.prox == head){
                head.prox = head;
                aux.prox = null;
                return true;
            }else { 
                while ((aux.prox).prox != head){
                    aux = aux.prox;
                }
                Celula aux2 = aux.prox;
                aux.prox = head;
                aux2.prox = null;
            }
        }
    }
//-------------------------------------------------------------------------------------------
    public void print (){
        if (empty()) {
            system.out.println("A lista está vazia!");
        return;
        }
        Celula aux = head.prox;
        while (aux != head) {

            system.out.println("Valor = " + aux.valor);
            aux = aux.prox;
        }
    }
}

