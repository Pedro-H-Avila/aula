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
		}
	}
	public void inserirNoInicio( Celula firstCell) {

	}
	public void printer (){
		Celula aux = firstCell;
		while( aux != null){
			System.out.println("Valor = " + aux.valor);
			aux = aux.prox;
		}
	}
}
