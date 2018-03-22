package Week_3;

public class Farm {
    private Animal[] pitomnik;

    public void setPitomnik(Animal[] pitomnik) {
        this.pitomnik = pitomnik;
    }

    public Animal[] getPitomnik() {
        return pitomnik;
    }

    public Animal[] addAnimalAndReturnArrayAnimal(Animal animal) {
        Animal[] arr = {animal};
        Animal[] arrayAnimal = new Animal[pitomnik.length + arr.length];
        System.arraycopy(pitomnik, 0, arrayAnimal, 0, pitomnik.length);
        System.arraycopy(arr, 0, arrayAnimal, pitomnik.length, arr.length);
        pitomnik = arrayAnimal;

        return pitomnik;
    }

    public Animal[] selectAnimal(Object clazz, double start, double end) {
        Animal[] selectAnimals = new Animal[pitomnik.length];
        int count = 0;
        for (Animal animal : pitomnik) {
            if (animal.getClass().equals(clazz)) {
                while (animal.getAge() >= start && animal.getAge() <= end) {
                    selectAnimals[count] = animal;
                    count++;
                    break;
                }
            }
        }
        Animal[] selectAnimalsEnd = new Animal[count];
        for (int i = 0; i < count; i++) {
            selectAnimalsEnd[i] = selectAnimals[i];
        }
            return selectAnimalsEnd;
    }

}
