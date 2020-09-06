package learnSelenium;

public class StringConcepts {
	
	public static void main(String[] args) {
		
		
		//Way 1, String Literal
		
		String text = "Bangladesh Sylhet";
		String text1 ="Bangladesh Sylhet";
		
		//Way 2,using string object
		
		//String txt1 = new String("Bangladeshs Sylhet"); 
		//(variable be defferent from way 1)
		
		//To see the ' Memory Location' of the Value use -
		
		
		//System.out.println(System.identityHashCode(text));
		
		//(System.out.println(System.identityHashCode(text1));
		
		//System.out.println(System.identityHashCode(txt1));     //for way 2
		
		//String Class Method
		//1.Equels --Reterns true or false,== means one equal,use for memory address
		System.out.println(text.equals(text1));  //compares the Value ,true/false
		System.out.println(text == text1);       //compares memory address of string value,(close equels sign ==)
		
		//2.Lenght() returns count of string
		//text.length();
		//String text2 = "String concept";
		//System.out.println(text2.length());//returns 14 ,length of text2 value ie 'String concept'ocupied area.
		
		//3.oncatenation/concat-If we concat dfferent data type variable,we use +, join tow string value,
		
		String num ="20";
		String num1 ="35";
		int a = 10;
		int b =25;
		
		//(num+a);
		//(a+b);
		//(num+num1);
		//System.out.println(num+a); //string+int,2010,return side by side
		//System.out.println(a+b);//int+int,returns 35,Add
		//System.out.println(num+num1);//string=string,returns 2035,side by sid
		 
		//4.Trim() ,want to remove white space from both side of a string-- use trim.
		String line ="     string concept      ";
		
			System.out.println(line);       //will show 'string' line both side white space
										
		    System.out.println(line.length());//line and length
		   //Syso System.out.println(line.trim());      //delete white space of the string
		   // System.out.println(line.trim().length());  //trim the line(delite extra white space)and show the length.
		
		//5.Sub string(). returns partial string
		    
		
		 String text3= "Learning String";
		 System.out.println(text3.substring(9));//if put space no( exp 9)it will beging the string from that space,say from String.
		 System.out.println(text3.substring(0, 8)); //to get aparticuler part of string,--begining index 
		// and ending index of string ,here lerning will be printed.
		 System.out.println(text3.substring(9, 15));//        --    do --
		 
		 //6.to lower case()-convert all of the string as lower case,
		  String text4= "Compare String";
		  text4.toLowerCase();
		 System.out.println(text4.toLowerCase());//will print compare string ,ie all lower case
		 
		 //to upper case
		  System.out.println(text4.toUpperCase());//will print all upper case like COMPARE STRING.
		  //7.charAt() returns charecter based on given index numb.er
		     String text5 ="compare string";
		   	 System.out.println(text5.charAt(2));//print will be 2 no char-m (0,1,2)
		     
		  //8.  indexOf()--return the position of the charecter,
		     System.out.println(text5.indexOf("p"));//m ,position no is 2.
		   //  System.out.println(text5.indexOf("s"));//8
		     
		 //9.(v.imp)startWith()- given string start with particuler charecter/collection of charecter or not,return-true or false.
		    System.out.println(text5.startsWith("c"));//true
		     System.out.println(text5.startsWith("om"));//false
		     System.out.println(text5.startsWith("st"));//false*/
		     
		// endswith()
		     
		 System.out.println(text5.endsWith("ing"));   
		 System.out.println(text.endsWith("re")); 
		     
		     
		 // contains();--given string is available in entire string ,-returns true/false
		     
		  System.out.println(text5.contains("comp"));
		  System.out.println(text5.contains("query"));

		   
		     
		     
		     
		     
				
		
	}
	
	
	

}
