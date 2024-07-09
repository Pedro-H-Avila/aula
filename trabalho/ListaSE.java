public class ListaSE{ 
	Celula firstCell;	

	public ListaSE () {
	firstCell = null;
	}
//-------------------------------------------------------------------------------------------
	public boolean empty() {
		return (firstCell == null);
	}
//-------------------------------------------------------------------------------------------
	public void inserirNoInicio(Celula c) {
        c.prox = firstCell;
        firstCell = c;
    }
//-------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------
	 public boolean removerInicio() {
        if (firstCell == null) {
            return false; // Lista está vazia
        }
        firstCell = firstCell.prox; // Atualiza o início para a próxima célula
        return true;
    }
//-------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------
public Celula pesquisar(int v) {
        Celula aux = firstCell;
        while (aux != null) {
            if (aux.valor == v) {
                return aux;
            }
            aux = aux.prox;
        }
        return null;
    }
	
//-------------------------------------------------------------------------------------------
	public void printer (){
		Celula aux = firstCell;
		while( aux != null){
			System.out.println("Valor = " + aux.valor);
			aux = aux.prox;
		}
	}
		
}

