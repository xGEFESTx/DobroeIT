package Week_3;

abstract class Animal {

    private int age;
    private String name;

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


    abstract void voice();


    //-------- узнаем сколько  создано животных --------//
    private static int count = 0;
    Animal (){
        count++;
    }
    public void countObj(){
        System.out.println("Было создано " + count + " животных");
    }
}
