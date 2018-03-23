package Week_3;

abstract class Animal {

    private double age;
    private String name;
    private static int count = 0;

    public Animal(double age, String name) {
        setAge(age);
        setName(name);
        count++;
    }


    public void setAge (double age){
        if (age <= 0){
            System.out.println("Вы не ввели неправильный возраст");
        }
        else {
            this.age = age;
        }
    }
    public double getAge (){
        return age;
    }

    public void setName (String name){
        if (name.isEmpty()){
            System.out.println("Вы не ввели имя");
        }
        else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return age + " лет, кличка - " + name ;
    }

    abstract void voice();


     public void countObj(){
        System.out.println("Было создано " + count + " животных");
    }
}
