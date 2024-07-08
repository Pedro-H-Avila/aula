public class ListaSE{ 
	Celula firstCell;
		firstCell = null
	}
	public boolean empty() {
		return (firstCell == null);
	}
	public void inserirNoFim(Celula firstCell) {
		if (empty()) {
			firstCell = null
		}else {
		Celula aux = firstCell;
		while (aux.prox != null){
			aux = aux.prox;
		}
		aux.prox = c;
	}
	public void inserirNoInicio( Celula firstCell) {
		c.prox = firstCell;
		primeiro = c;

	}
	public void printer (){
		Celula aux = firstCell;
		while( aux != null){
			System.out.println("Valor = " + aux.valor);
			aux = aux.prox;
		}
	}
}
