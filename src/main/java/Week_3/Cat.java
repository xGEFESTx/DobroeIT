package Week_3;

public class Cat extends Animal{
    private int age;
    private String name;
    private static int count = 0;
    private String say = "Мяу";


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
          return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
          return name;
    }




    public void voice() {
        System.out.println(say);
    }

    //-------- узнаем сколько  создано котов --------//
    public Cat (){
        count++;
    }
    public void countObj(){
        System.out.println("Было создано " + count + " котов");
    }
}
