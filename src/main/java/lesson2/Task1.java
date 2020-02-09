package lesson2;

public class Task1 {
   
    public static void main(String[] args) {
        Task1 tsk1 = new Task1();
        tsk1.setAge(101);
        System.out.println(tsk1.getAge());
        System.out.println(tsk1.getAgeGroup());
        tsk1.setName(" oLhA ");
        System.out.println(tsk1.getName());
    }

    private int age;

    public void setAge(int a) {
        if(a>=0 && a<=100) {
            age = a;
            setAgeGroup(age);
        } else {
            System.out.println("Age must be between 0 and 100");
        }
    }
    public int getAge(){
        return age;
    }
    private String name;

    public void setName(String n) {
        if(n.length() >=3 && n.length() <=50) {
            if (n.trim().length() == 0) {
                System.out.println("Name cannot be made of spaces. Please enter name with alphabet characters!");
            } else {
                n = n.trim();
                name = n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase();
            }
        }

    }
    public String getName() {
        return name;
    }
    private String ageGroup;

    private void setAgeGroup(int a) {
        if (a < 15) {
            ageGroup = "child";
        } else if(a>=15 && a<=25) {
            ageGroup = "student";
        } else if(a>=26 && a<=65) {
            ageGroup = "worker";
        } else if(a>=66) {
            ageGroup = "pensioner";
        }
    }
    public String getAgeGroup() {
        return ageGroup;
    }

}

