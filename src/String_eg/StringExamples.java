package String_eg;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="  Welcome";
      
      String str1 =new String("Morning");
      
     System.out.println( "length of the string :"+str.length());
     
     System.out.println( "string convert to uppercase letter :"+str.toUpperCase());
     
     System.out.println( "string convert to lowercase letter :"+str.toLowerCase());
     
     System.out.println( "check the string is empty or not  :"+str.isEmpty());
     
     System.out.println( "two string are equal or not : "+str.equals(str1));
     
     System.out.println( "length of the string :"+str.charAt(4));
     
     System.out.println( "first occurence character return index"+str.indexOf("e"));
	
     System.out.println("trim method remove starting space  :"+str.trim());
     
     System.out.println("replace another character to that char :" + str.replace("e" , "r"));
		
     System.out.println("substring :"+str.substring(0,5));
     
     System.out.println("contains "+ str.contains("le"));
     
//     System.out.println("split method :"+str.split(","));
     
     System.out.println("concat method "+str.concat(str1));
     
     System.out.println("using add operator"+(str+str1));
     
     //stringbuilder 
     StringBuilder sb=new StringBuilder("Hello");
//     sb.append("world");
     sb.replace(1, 4, "kkkkkk");
     System.out.println(sb.toString());
     
     //concat 
     String str3="hello";
     str3.concat("nnnn");
     System.out.println(str3);
     
     StringBuilder s=new StringBuilder("04565478");
     
     s.reverse();
     System.out.println("reverce  "+s.toString());
     int n=44;
     
     
     String asnumber=Integer.toString(n);
     
     System.out.println("conver to string "+asnumber);
     
       System.out.println("The type of 'numberAsString' is: " + ((Object) asnumber).getClass().getSimpleName());
     
     //split method 
     String strsplit="1,2,3,4";
     String [] cart1= strsplit.split(",");
     System.out.println("cart1   "+cart1);
     
     //join 
    String  strjoin = String.join(" * ",cart1);
    System.out.println(" join method   "+strjoin);
     
     
     
   //methods
//		length()	Returns the length of the string	"Java".length() → 4
//		charAt(index)	Returns the character at the specified index	"Java".charAt(2) → 'v'
//		substring(start, end)	Returns a substring from start (inclusive) to end (exclusive)	"Hello".substring(1, 4) → "ell"
//		equals(str)	Compares two strings for equality	"Java".equals("java") → false
//		equalsIgnoreCase(str)	Compares two strings ignoring case differences	"Java".equalsIgnoreCase("java") → true
//		toUpperCase()	Converts the string to uppercase	"java".toUpperCase() → "JAVA"
//		toLowerCase()	Converts the string to lowercase	"JAVA".toLowerCase() → "java"
//		trim()	Removes leading and trailing spaces	" Java ".trim() → "Java"
//		replace(old, new)	Replaces occurrences of a character or string	"Java".replace('a', 'o') → "Jovo"
//		split(delimiter)	Splits the string into an array	"A,B,C".split(",") → ["A", "B", "C"]
//		contains(str)	Checks if the string contains a specific substring	"Java".contains("av") → true
//		indexOf(char/str)	Returns the index of the first occurrence of a character or substring	"Java".indexOf('a') → 1
//		isEmpty()	Checks if the string is empty	"".isEmpty() → true
	}
}
