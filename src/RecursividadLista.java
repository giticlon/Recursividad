import java.util.ArrayList;
import java.util.List;

public class RecursividadLista {

	
	
	public RecursividadLista() {
		super();
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println("---- Recursividad retorno Lista -----");
		
		lista = getIntegerListUntilZero(5, lista);
		
		imprimeLista(lista);
	}


	public List<Integer> getIntegerListUntilZero(int level, List<Integer> lista){
		System.out.println("level: " + level + " lista size: " + lista.size());
		
		lista.add(level);
		
		if(level == 0) {
			return lista;
		}
		
		lista = getIntegerListUntilZero(--level, lista);
		
		return lista;
	}

	private void imprimeLista(List<Integer> lista) {
		System.out.println("Lista final");
		lista.stream().forEach(item -> System.out.println(item));
		
	}
}
