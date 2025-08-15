import java.util.HashSet;

public class CloneList {

	public static void main(String[] args) {
     HashSet<String> hs=new HashSet<String>();
		
		hs.add("Red");
		hs.add("white");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("Black");
		hs.add("Green");
		
		System.out.println("Original Hash Set: "+hs);		

		hs.clone();
		
		System.out.println();
		System.out.println("Cloned Hash set: "+hs);

	}

}
