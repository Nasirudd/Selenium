package learnSelenium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {



	public static void main(String[] args) {
		
		
		//HashSet
	//Implementation classes for set=	
		
	//Hashset,TRee Set,LinkedHash set	
		
	//SYNTAX:	
		
	        Set<Integer>obj = new HashSet<Integer>();//Random order
        // Set<Integer> obj = new TreeSet<Integer>();   //Mantain ascending order
	       // Set<Integer> obj = new LinkedHashSet<Integer>();//inserting order
		
//	1.add Item in set -=use--obj.add()	
		
	  /*	obj.add(8487);
		obj.add(2345);
		obj.add(3457);
		obj.add(4567);
		obj.add(5678);
		obj.add(67895);
		obj.add(7890);
		obj.add(9853);
		
		
	//for (Integer eachobj : obj) {
	//System.out.println(eachobj);
	}
		
	
	
//2.get	count of set-use size/
	
	//System.out.println(obj.size());
	
	//3.remove/delete item -use remove
	
	//obj.remove(3);
	
	//System.out.println(obj.size());
			
	/*for (Integer integer : obj) {
		System.out.println(integer);
	}*/
	
		//System.out.println(obj.contains(2345));
	
	//5.Remove all item from the list, use--clear()		
			
	 //  obj.clear();
	//After clear,for confirm the list is emty or not-  use --is Empty,
	 //  System.out.println(obj.isEmpty());
	   
	
	//__Hash set string//
	 
	  // Set<String>obj = new HashSet<String>();//
	  // Set<String>obj = new TreeSet<String>();//
	    //Set<String>obj = new LinkedHashSet<String>();//
	   
	   
	 //add item in list  -use  obj.add(),-------obj may be any word.  
		/*obj.add("Kabir");
		obj.add("Zalil");
		obj.add("Rahim");
		obj.add("Aysha");
		obj.add("Maysha");
		obj.add("Nisha");
		obj.add("Bidisha");
	
		for(String eachobj : obj){
		
		System.out.println(eachobj);*//
		

		
		}
		
	
		
		}
			
}
		
		

	


