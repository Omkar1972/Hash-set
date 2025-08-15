import java.util.HashSet;

public class RemoveElements {

	public static void main(String[] args) {
		 HashSet<String> hs=new HashSet<String>();
			
			hs.add("Red");
			hs.add("white");
			hs.add("Green");
			hs.add("Black");
			
			
			System.out.println("Original Hash Set: "+hs);		

		    hs.removeAll(hs);
		    
		    System.out.println("HashSet content:"+hs);

	}

}
