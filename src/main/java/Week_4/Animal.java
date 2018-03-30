package Week_4;

abstract class Animal {

    private double age;
    private String name;

    public Animal(double age, String name) {
        setAge(age);
        setName(name);
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

    //Переопределяем метода equals() для сравнения животных одинакового типа и с одинаковым возрастом и именем и  распознании их как одинаковые
    public boolean equals (Object obj) {

        if(obj == null) {
            return false;
        }
        // вот тут я попал в ступор, так как instanceof может принять и null в связи с чем если я
        // правильно все понял то проверка на null уже не нужна... но так как я не уверен, то проверку оставил :)
        if (!(obj instanceof Animal)){
            return false;
        }
        Animal sameAnimal = (Animal) obj;
        if (this.getName() == (sameAnimal.getName())) {
            if (this.getAge() == sameAnimal.getAge()) {
                if (this.getClass().isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Переопределяем метод toString() для вывода на печать информации о типе животного, его возраст и имя
    @Override
    public String toString() {

        return  getClass() + ", Возраст - " + getAge() + ", кличка - " + getName() ;
    }

    abstract void voice() throws NotImplementedException;
    abstract void dyingVoice();
    protected void finalize(){
        dyingVoice();
    }
}
