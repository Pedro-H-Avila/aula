<<<<<<< HEAD
public class ListaSE {
    Celula next;
=======
public class ListaSE{ 
	Celula firstCell;																																				
	public ListaSE () {
	firstCell = null;
	}
	public void removeEnd (Celula c){
		Celula auxfirstCell = firstCell;
		if (auxfirstCell == null){
			firstCell = null;
		}
	}
>>>>>>> 201c46b9a3773bd22f8242c104cd966dc84bdda4

<<<<<<< HEAD
    ListaSE(){
        pcelula = null;
    }

    public boolean empty(){
        return (pcelula == null);
    }
    public void insereNoFim(){

    }
    public void insereNoInicio (Celula c){
        c.next = pcelula;
        pcelula = c;
    }
    public void imprimir (){
        Celula aux = pcelula;
           While(aux != null);{
             System.out.println("value: " + aux.value);
             aux = aux.next;
        }
    }
}

=======
	public boolean empty() {
		return (firstCell == null);
	}

	public void inserirNoFim(Celula c) {
		if (empty()) {
			firstCell = c;
		}
		else {
		Celula aux = firstCell;
		while (aux.prox != null){
			aux = aux.prox;
		}
		aux.prox = c;
	}
}
	public void inserirNoInicio( Celula c) {
		c.prox = firstCell;
		firstCell = c;

	}
	 public void removerFim() {
        if (firstCell == null) {
            return; // Lista vazia
        }

        if (firstCell.prox == null) {
            firstCell = null; // Lista com apenas um elemento
        } else {
            Celula aux = firstCell;
            while (aux.prox.prox != null) {
                aux = aux.prox;
            }
            aux.prox = null; // Remove a última célula
        }
    }
	public void printer (){
		Celula aux = firstCell;
		while( aux != null){
			System.out.println("Valor = " + aux.valor);
			aux = aux.prox;
		}
	}
		
}

>>>>>>> 201c46b9a3773bd22f8242c104cd966dc84bdda4