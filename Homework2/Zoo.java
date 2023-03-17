import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
    private List<T> animals;
    public Zoo() {
        animals = new ArrayList<T>();
    }
    //добавляем животное в зоопарк
    public void addAnimal(T animal) {
        animals.add(animal);

    }
    //выводим данные о животных в зоопарке
    public void getInfo() {
        for(T animal : animals) {
            System.out.println(animal);
            System.out.println();
        }
    }
    //смотрим информацию о животном по индексу
    public void getInfoAboutAnimal(int i) {
        System.out.println(animals.get(i));
    }
    //удаляем животное из зоопарка
    public void removeAnimal(int i) {
        animals.remove(i);
    }
    //заставить животное с индексом i издать звук
    public void getSound(int i) {
        animals.get(i).makeSound();
    }
    //все животные издают звук
    public void makeSound() {
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
    public Animal[] getAnimals(){
        Animal[] newArr = new Animal[animals.size()];
        int i = 0;
        for(Animal animal : animals) {
            newArr[i++] = animal;
        }
        return newArr;
    }

}
