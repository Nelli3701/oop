import java.util.ArrayList;

public class Zoo {
    static ArrayList<Animal> animals = new ArrayList<Animal>();

    //выводим данные о животных в зоопарке
    public static void getInfo(ArrayList<Animal> animals) {
        for(Animal animal : animals) {
            System.out.println(animal);
            System.out.println();
        }
    }
    //все животные издают звук
    public static void makeSound(ArrayList<Animal> animals) {
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
    //добавляем животное в зоопарк
    public static void addAnimal(Animal animal) {
        animals.add(animal);

    }
    //удаляем животное из зоопарка
    public static void removeAnimal(int i) {
        animals.remove(i);
    }
    //смотрим инофрмацию о животном по индексу
    public static void getInfoAboutAnimal(int i) {
        System.out.println(animals.get(i));
    }
    //заставить животное с индексом i издать звук
    public static void getSound(int i) {
        animals.get(i).makeSound();
    }
}
