package Week_3;

import java.util.Arrays;

public class CreateingAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2.3, "Myr");
        Cat cat2 = new Cat(0.6, "Nyau");
        Cat cat3 = new Cat(9.5, "Tom");
        Cat cat4 = new Cat(4.5, "Poli");

        Dog dog1 = new Dog(0.5, "Rex");
        Dog dog2 = new Dog(2.6, "Rox");
        Dog dog3 = new Dog(8.1, "Bob");
        Dog dog4 = new Dog(5.0, "Blobel");

        Animal[] animals = {cat1, cat2, cat3, cat4, dog1, dog2, dog3, dog4};



        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                if (animal.getAge() < 1.0){
                    int number1 = Arrays.asList(animals).indexOf(animal);
                    System.out.println(number1);
                }
                if (animal.getAge() > 8.0){
                    int number1 = Arrays.asList(animals).indexOf(animal);
                    System.out.println(number1);
                }

                System.out.println(animal);
            }
            if (animal instanceof Dog) {
                System.out.println(animal);
            }
        }



    }


}