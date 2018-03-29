package Week_4;

public class Dog extends Animal{

    Dog(double age, String name){
        super(age, name);
    }
    public void voice () {
        System.out.println("Gaf");
    }


    //звук, издаваемый животным перед смертью
    private void dyingVoice() {
        System.out.println("Ga-y-y-y-y-y-y-y.....");
    }

    protected void finalize(){
        dyingVoice();
    }

    //генерируем обьект
    public void generator(double age, String name){
       Dog dog = new Dog(age, name);
    }

}
