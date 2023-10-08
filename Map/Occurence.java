package Map;

import java.util.HashMap;
import java.util.Iterator;

public class Occurence {

	public static void main(String[] args) {
		int arr [] =  {5,4,3,5,3,2};
		HashMap<Integer,Integer> h1 = new HashMap();
		for (int i = 0; i < arr.length; i++) 
		{
			if (! h1.containsKey(arr[i]))
			{
				h1.put(arr[i], 1);
			}
			else {
				int x = h1.get(arr[i]);
				x++;
				h1.put(arr[i], x);
			}
		}
		
		System.out.println(h1);
	
	
	
	}
} 
