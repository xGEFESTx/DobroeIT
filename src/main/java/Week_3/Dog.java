package Week_3;

public class Dog extends Animal{
    private int age;
    private String name;
    private static int count = 0;
    private String say = "Гав";



    public void setAge (int age){
        this.age = age;
    }
    public int getAge (){
        return age;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }




    public void voice () {
        System.out.println(say);
    }

    //-------- узнаем сколько  создано собак --------//
    public Dog (){
        count++;
    }
    public void countObj(){
        System.out.println("Было создано " + count + " собак");
    }
}
