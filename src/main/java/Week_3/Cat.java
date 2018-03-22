package Week_3;

public class Cat extends Animal{

    Cat(double age, String name){
        super(age, name);
    }

    private String say = "Мяу";


    public void voice() {
        System.out.println(say);
    }
    @Override
    public String toString() {
        return "Кот " + super.toString();
    }

}