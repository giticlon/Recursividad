import java.util.ArrayList;
import java.util.List;

public class Recursividad {

	
	
	public Recursividad() {
		super();
		List<Integer> lista = new ArrayList<Integer>();
		
		lista = getIntUntilZero(5, lista);
		
		imprimeLista(lista);
	}


	public List<Integer> getIntUntilZero(int level, List<Integer> lista){
		System.out.println("level: " + level + " lista size: " + lista.size());
		
		lista.add(level);
		
		if(level == 0) {
			return lista;
		}
		
		lista = getIntUntilZero(--level, lista);
		
		return lista;
	}

	private void imprimeLista(List<Integer> lista) {
		System.out.println("Lista final");
		lista.stream().forEach(item -> System.out.println(item));
		
	}
}
