import java.util.HashSet;

public class EmptySet {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Red");
		hs.add("white");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("Black");
		hs.add("Green");
		
		System.out.println("Original Hash Set: "+hs);		

		hs.removeAll(hs);
		
		System.out.println();
		System.out.println("Hash Set after removing all the elements "+hs);
		
		
		

	}

}
//Sample Output:Original Hash Set: [Red, White, Pink, Yellow, Black, Green] 
//Hash Set after removing all the elements []