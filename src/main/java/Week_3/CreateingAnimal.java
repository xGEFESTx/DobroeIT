package Week_3;

public class CreateingAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2.3, "Myr");
        Cat cat2 = new Cat(0.6, "Nyau");
        Cat cat3 = new Cat(9.5, "Tom");
        Cat cat4 = new Cat(4.5, "Poli");

        Dog dog1 = new Dog(0.5, "Rex");
        Dog dog2 = new Dog(2.6, "Rikitakoo");
        Dog dog3 = new Dog(8.1, "Bob");
        Dog dog4 = new Dog(5.0, "Blobe");

        Animal[] animals = {cat1, cat2, cat3, cat4, dog1, dog2, dog3, dog4};


        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(animal);
            }
            if (animal instanceof Dog) {
                System.out.println(animal);
            }
        }

    }

    public static Animal[] sameAnimal(Animal[] animals) {
        Animal[] animals1Select = new Animal[animals.length];

        int counterElements = 0;


        for (Animal animal : animals) {

            if (animal instanceof Cat) {
                while (animal.getAge() > 1.0 && animal.getAge() < 8.0){
                    animals1Select[counterElements] = animal;
                    counterElements++;
                    break;
                }

            }

            if (animal instanceof Dog) {
                char[] name = animal.getName().toCharArray();
                int countVowels = 0;
                for (char letter: name) {
                    switch (letter) {
                        case ('A'):
                        case ('a'):
                        case ('E'):
                        case ('e'):
                        case ('I'):
                        case ('i'):
                        case ('O'):
                        case ('o'):
                        case ('U'):
                        case ('u'):
                        case ('Y'):
                        case ('y'):
                            countVowels++;
                    }
                }
                if (countVowels > 4) {
                    continue;
                }
                animals1Select[counterElements] = animal;
                counterElements++;
            }
        }
        Animal[] animalsSelectEnd = new Animal[counterElements];
        for (int i = 0; i < counterElements; i++ ){
            animalsSelectEnd[i] = animals1Select[i];
        }
        return animalsSelectEnd;
    }
}