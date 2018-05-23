package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class printwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list=new ArrayList<>();  
		    list.add(10);//storing Integer object  
		    list.add(20);//Now compiler converts it into Integer.valueOf(20) which is object  
		    list.add(30);  
		      
		    System.out.println("Traversing List...");  
		    for(Integer i:list){  
		        System.out.println(i);  
		    }  
		

	}

}
