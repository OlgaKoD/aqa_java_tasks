package lesson1;

public class Task5 {
    
    public static void main(String[] args) {
        System.out.println(reverse("Hello world!!!"));
    }

 	    public static String reverse(String str) {
   	    String result = ""; 
   	    char[] Hi = str.toCharArray(); 
   	    for (int i = Hi.length-1; i>=0; i--) {
        result =  result + Hi[i];}
        return result;
        }
}
