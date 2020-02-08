package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

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

