import java.util.HashSet;
import java.util.TreeSet;

public class ConvertSet {

	public static void main(String[] args) {
		 HashSet<String> hs=new HashSet<String>();
			
			hs.add("Red");
			hs.add("white");
			hs.add("Pink");
			hs.add("Yellow");
			hs.add("Black");
			hs.add("Green");
			
			System.out.println("Original Hash Set: "+hs);		

			TreeSet<String> Ts=new TreeSet<String>();
			
			Ts.addAll(hs);
			
			System.out.println();
			System.out.println("TreeSet Elements:");
			for(String a:Ts)
			{
				System.out.println(a);
			}
			
//			for(int i=0;i<Ts.size();i++)
//			{
//				System.out.println();
//			}
	}

}
