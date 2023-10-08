package Map;
import java.util.*;
//import java.util.Map.Entry;

public class Occurenece_number {

	public static void main(String[] args) {
		int arr [] = {5,2,4,3,2,4};
		TreeMap<Integer, Integer> l1 = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) 
		{
			if (! l1.containsKey(arr[i]))
			{
				l1.put(arr[i], 1);
			}else {
				int x = l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		
		System.out.println(l1);
		
		int x = 0;
		int y = 0;
		for (Map.Entry<Integer,Integer> e1 : l1.entrySet())
		{
			if (e1.getValue() > 1)
			{
				int z = e1.getValue();
				if (x < z)
				{
					x = z;
					y = e1.getKey();
				}
			}
		}
		System.out.println(y + "->" + x);
	}

}
