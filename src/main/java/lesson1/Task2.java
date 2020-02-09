package lesson1;

public class Task2 { 
    
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        String s = t2.printName("Olha");
        System.out.print(s);
    }

    public String printName(String name) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                result += name + " ";
            }
            result = result.trim();
            result += System.lineSeparator();
        }
        return result;
    }
}
