package Week_4;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(0.6, "Mor");
        Cat cat2 = new Cat(0.6, "Mor");
        Dog dog = new Dog(3.0, "Tom");
        Fish salmon = new Fish(1.2, "Salamon");
        Fish trunks = new Fish(0.6, "Trunk");
        Animal[] arrayAnimal = {cat1, salmon, cat2, dog, trunks};

        for (Animal animal: arrayAnimal){
            try {
                animal.voice();
            } catch (NotImplementedException e) {
                int count = 0;
                count++;
                System.out.println(count);
            }
        }


//        //Генерируем большое количество собак
//        for ( int count = 1; count < 700000; count++){
//            dog.generator(5.0, "Bob");
//        }
//        //Генерируем большое количество котов
//        for (int count = 1; count < 900000; count++){
//            cat1.generator(3.3, "Мурзик");
//        }


 //       System.out.println(nameClass(cat1));

    }
public static String nameClass (Animal animal){
        String name = animal.getClass().getName();

        return name;
}

}
