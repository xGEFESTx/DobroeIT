package Week_3;

public class Dog extends Animal{
    private int age;
    private String name;

    public void setAge (int age){
        this.age = age;
    }
    public int getAge (int age){
        this.age = age;
        return age;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName(String name) {
        this.name = name;
        return name;
    }


    private String say = "Гав";
    @Override
    public void voice (String say) {
        super.voice(say);
    }

    //-------- узнаем сколько  создано собак --------//
    private static int count = 0;
    Dog (){
        count++;
    }
    public void setCount(){
        System.out.println("Было создано " + count + " собак");
    }
}
