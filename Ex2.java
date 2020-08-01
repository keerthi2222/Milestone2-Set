package set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex2
{
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Kittu");
		set.add("Moni");
		set.add("Janu");
		set.add("Swetha");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
