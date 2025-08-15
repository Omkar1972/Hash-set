import java.util.HashSet;
import java.util.Iterator;

public class IterateElements {

	public static void main(String[] args) {
    HashSet<String> hs=new HashSet<String>();
		
		hs.add("Red");
		hs.add("white");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("Black");
		hs.add("Green");
		
		//System.out.println("Original Hash Set: "+hs);		
		
		
		Iterator  a=hs.iterator();
		
		System.out.println("Input:");
		while(a.hasNext())
		{
			System.out.println(a.next());
		}

       Iterator  b=hs.iterator();
		
        System.out.println();
		System.out.println("Output:");
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
	}

}
