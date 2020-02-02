package lesson1;

public class Task4 {
    
    public static void main(String[] args) { 
    
        String s = "Olga"; 
        int i = 0; 
        do {
        int j = 0; 
        do {
        System.out.print( s + " ");
        j++;
        }
        while(j<10);
        System.out.println();
        i++;
        }
        while(i<5);
    }
}
