import java.util.HashSet;

public class convertArray {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Red");
		hs.add("white");
		hs.add("Pink");
		hs.add("Yellow");
		hs.add("Black");
		hs.add("Green");
		
		System.out.println("Original Hash Set: "+hs);

		String[] a=new String[hs.size()];
		hs.toArray(a);
		
		System.out.println();
		System.out.println("Array Elements: ");
		for(String b:a)
		{
			System.out.println(b);
		}

	}

}
//Test input:
//Red, White, Pink, Yellow, Black, Green
//
//
//Sample Output:Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
//Array elements: 
//Red
//White
//Pink
//Yellow
//Black
//Green