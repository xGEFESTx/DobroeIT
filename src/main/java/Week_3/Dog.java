package Week_3;

public class Dog extends Animal{

    Dog(double age, String name){
        super.setAge(age);
        super.setName(name);
    }

    private String say = "Гав";

    public void voice () {
        System.out.println(say);
    }

    @Override
    public String toString() {
        return "Собака " + super.toString();
    }
}