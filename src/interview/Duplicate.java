package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	private static int i;
	private static int j;
	 int count=0;
	private static String word;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String arr[]={"raj","ravi","kiran","ravi","kiran","name","name","name"};
		/*for(int i=0;i<=arr.length-1;i++);
		{
			for(int j=i+1;j<=arr.length;j++);
			{
				if(arr[i].equals(arr[j]))
				{
					 
					System.out.println("duplicate name is:" + arr[j]);
					count++;
					
				}
			}
		}

		Set<String> hs= new HashSet<String>();
		for(String word:arr)
		{
			if(hs.add(word)==true)
			{
			System.out.println(word);
			}
		}
		
		int count=0;
		Map<Integer,String> hm = new HashMap<Integer,String>();
		for(String word: arr)
		{
			Integer count =hm.get(word);
			if(count==null)
			{
				hm.put(1, word);
			}
			else
			{
				hm.put(word, ++count);
			}
				
		}
		*/
		List<String> list = new ArrayList<String>();
		list.add("raj");
		list.add("bang");
		list.add("car");
		list.add("raj");
		list.add("car");
		list.add("car");
		list.add("bang");
		list.add("raj");
		list.add("delhi");

		System.out.println("no. of times of a");
		System.out.println("a : " + Collections.frequency(list, "a"));
		
		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp)+"times repeated");
		}
		
		System.out.println("\nExample 3 - Count all with Map");
		
		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String word : list) {
			Integer count = hm.get(word);
			//hm.put(word, (count == null) ? 1 : count + 1);
			if(count==null)
			{
				hm.put(word,1);
			}
			else
			{
				hm.put(word, ++count);
			}
		}
		printMap(hm);
		
	}

	private static void printMap(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		for(Map.Entry<String,Integer> hm1: map.entrySet())
		
			System.out.println("key:"+ hm1.getKey()+ "  value:"+ hm1.getValue());
		
		
	}

}
