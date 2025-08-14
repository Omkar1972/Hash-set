import java.util.HashSet;

public class CompareSet {

	public static void main(String[] args) {
	 HashSet<String> hs=new HashSet<String>();
	 
	 hs.add("red");
	 hs.add("Green");
	 hs.add("black");
	 hs.add("White");
	 
	 System.out.println(hs);
	 
	 HashSet<String> hs1=new HashSet<String>();
	 
	 hs1.add("red");
	 hs1.add("Pink");
	 hs1.add("black");
	 hs1.add("Orange");
	 
	 
	 System.out.println(hs1);
	 
	// HashSet<String> yn=new HashSet<String>();
	 
	 System.out.println();
	 System.out.println("Sample Output:");
	 for(String a:hs)
	 {
		 if(hs1.contains(a))
		 {
			System.out.println("Yes");
		 }
		 else
		 {
			 System.out.println("no");
		 }
	 }
	 
	
	
	 
	}

}
//Test input:
//[red,green,black,white]
//[red,pink,black,orange]
//
//Sample Output:Yes
//No
//Yes
//No