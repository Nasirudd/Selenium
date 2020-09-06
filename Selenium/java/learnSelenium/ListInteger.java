package learnSelenium;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

	public static void main(String[] args) {
		
		
		List<Integer> lst = new ArrayList<Integer>();
		
	//1.	//add integer in the list
		
		lst.add(469);
		lst.add(4562);
		lst.add(3426);
		lst.add(8765);
		lst.add(4536);
		lst.add(9476);
		lst.add(4562);
		
		
		
	//	System.out.println(lst);
		
	//2.get count of list	
		
	System.out.println(lst.size());
	
	//3.add one item
	lst.add(3,6000);
	for(Integer eachlst:lst){                    
	
    System.out.println(eachlst);}
	
	
	
	
	
		

	}
	

}
