import java.util.Arrays;
import java.util.Comparator;

public class Compare {
	
	 public static void main( String args[])
	 {
	 String[] cities =
	{"Bangalore","Pune","San Francisco","New YorkCity"};
	 MySort ms = new MySort();
	 Arrays.sort(cities, ms);

	System.out.println(Arrays.binarySearch(cities,
	"New York City"));
	 }
	 static class MySort implements Comparator
	 {
	 public int compare( String a, String b)
	 {
	 return b.compareTo(a);
	 }

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	 }
	}


