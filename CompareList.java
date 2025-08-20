import java.util.ArrayList;
import java.util.HashSet;

public class CompareList {

	public static void main(String[] args) {
	 HashSet<String> hs=new HashSet<String>();
	 
	 hs.add("Red");
	 hs.add("White");
	 hs.add("Pink");
	 hs.add("Yellow");
	 hs.add("Black");
	 hs.add("Green");
	 
	 System.out.println("Original Hash Set: "+hs);
	 
	 ArrayList<String> a=new ArrayList<String>();
	 
	 a.addAll(hs);
	 
	 System.out.println();
	 System.out.println("ArrayList contains: "+a);

	}

}
