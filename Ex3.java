package set;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex3 
{
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Vicky");
		set.add("Alice");
		set.add("Janu");
		set.add("kittu");
		
		Iterator<String> it = set.iterator();
		String query = "Janu";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}


}
