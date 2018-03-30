package Week_4;

public class Fish extends Animal {
    public Fish(double age, String name) {
        super(age, name);
    }
    public void voice() throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Override
    void dyingVoice() {
        System.out.println("pgfkgfk.....");
    }

}
