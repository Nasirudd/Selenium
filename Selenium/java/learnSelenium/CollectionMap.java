package learnSelenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionMap {

	

	public static void main(String[] args) {
		
	
		
		//Syntax_:Map<Key,Value> VariableName = new HashMap <Key,Value>();				
		
		
		Map<String,Integer> mp = new HashMap <String,Integer>();      //Hash-generate random out put,not mantain order.
		
		//Map<String,String> mp = new  HashMap <String,String>();
		
		
		//Add new item--mp.put
		
		mp.put("Tuhin", 1234);
		mp.put("Zahin", 2435);
		mp.put("Karim", 3456);
        mp.put("Tuna", 5678);
        mp.put("Salam", 6789);
        mp.put("Kalam", 4657);
        mp.put("Shelly", 8970);
        mp.put("Rana", 9876);
        
	//SYNTEX: '2 dimention foreach loop' -Uses in MAP
	      // for(Entry<String,Integer>eachmp : mp.entrySet()){
	      // System.out.println(eachmp.getKey() + "             " + eachmp.getValue());}        //To print all key and value.
	       
	      // System.out.println(eachmp.getKey());          //To print all keys.
	        		       
	      // System.out.println(eachmp.getValue());         //To print all values.
	       
		//get count of Map entry	-size
	     // System.out.println(mp.size());
	      
		//get key:value of the key--,mp.get("Key");
       // System.out.println(mp.get("Karim"));
        
		//remove key--,remove key and its value,
       // mp.remove("Tuna");
        
        //contains key:serch by the key  ,return-false/true;
       // System.out.println(mp.containsKey("Tuna"));
        
        //contains(value),serch by the value;
       // System.out.println(mp.containsValue(6789));
        
        //Remove all mp /entry
	     //  mp.clear();  	
        //Is empty
        System.out.println(mp.isEmpty());
        
        
	        	
		}
		
		

	}


