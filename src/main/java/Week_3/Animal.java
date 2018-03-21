package Week_3;

abstract class Animal {

    private double age;
    private String name;

    public void setAge (double age){
        this.age = age;
    }
    public double getAge (){
        return age;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return age + " лет, кличка - " + name ;
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