package Week_4;

public class Cat  extends Animal {
    Cat(double age, String name) {
        super(age, name);
    }

    public void voice() {
        System.out.println("Mayu");
    }

    //звук, издаваемый животным перед смертью
    private void dyingVoice() {
        System.out.println("May-u-u-u-y-u-u-y-u-y.....");
    }

    protected void finalize(){
        dyingVoice();
    }
    //генерируем обьект
    public void generator(double age, String name){
        Cat cat = new Cat(age, name);
    }
}
