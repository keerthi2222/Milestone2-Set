package set;

	import java.util.*;

	public class Ex1 
	{
	static HashSet<String> H1=new HashSet<String>();

		public static HashSet<String> SaveCountryNames(String country) {
		H1.add(country);
		return H1;
		}

		public static String getCountry(String country) {
		for(String i:H1) {
		if(i.equalsIgnoreCase(country))
		{
		return i;
		}
		}
		return null;
		}

		public static void main(String args[]) {
		/* HashSet cloned_set = new HashSet();
		cloned_set = (HashSet)set.clone();
		cloned_set=(HashSet)SaveCountryNames("India").clone();
		cloned_set=(HashSet)SaveCountryNames("Sri Lanka").clone();
		cloned_set=(HashSet)SaveCountryNames("Russia").clone();
		*/
		SaveCountryNames("India");
		SaveCountryNames("Sri Lanka");
		SaveCountryNames("Russia");
		System.out.println(getCountry("India"));
		System.out.println(getCountry("USA"));
		}

	}
