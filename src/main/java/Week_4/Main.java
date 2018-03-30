package Week_4;

public class Main {
    public static void main(String[] args)  {
        int cout = 0;
        Cat cat1 = new Cat(0.6, "Mor");
        Cat cat2 = new Cat(0.6, "Mor");
        Dog dog = new Dog(3.0, "Tom");
        Fish salmon = new Fish(1.2, "Salamon");
        Fish trunks = new Fish(0.6, "Trunk");
        Animal[] arrayAnimal = {cat1, salmon, cat2, dog, trunks};


        //Выводим на консоль, что объекты cat1 и cat2 одинаковые так как их тип, возраст и имя одинаковые
        System.out.println(cat1.equals(cat2));


        //Выводим на печать информации о типе животного, его возраст и имя
        System.out.println(cat1);


        //Генерируем большое количество собак (провоцируем срабатывания сборщика мусора)
        // и выводим на консоль звук при уничтожении объекта
        for ( int count = 1; count < 700000; count++){
            dog.generator(5.0, "Bob");
        }
        //Генерируем большое количество котов (провоцируем срабатывания сборщика мусора)
        // и выводим на консоль звук при уничтожении объекта
        for (int count = 1; count < 700000; count++){
            cat1.generator(3.3, "Мурзик");
        }


        //Выводим на консоль имя класса данного объекта
        System.out.println(nameClass(cat1));


        // подсчитываем и выводим на консоль количество срабатываний NotImplementedException
        for (Animal animal: arrayAnimal){
            try {
               /* Вариант что бы не выводить срабатывание метода voice() на других обьъектах кроме Fish, так как с условия
               задачи я не понял нужно ли воводить его на конслось или только количесвто срабатываний NotImplementedException
               в связи с чем я эту часть кода закоментировал

                if(!(animal instanceof Fish)){
                    continue;
                }
                */
                animal.voice();
            } catch (Week_4.NotImplementedException e) {
                ++cout;
            }
        }
        System.out.println("NotImplementedException  сработало при прохождении по массиву " + cout + " раз");

    }

    // создаем статический метод который принимает на вход объект и
    // возвращает строку содержащую имя класа данного объекта
public static String nameClass (Animal animal){
        String name = animal.getClass().getName();

        return name;
}

}
