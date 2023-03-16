import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(20.10, 5, "blue", "Tom", "siberian",
        true, "white", "20/10/2020", true);
        Animal dog = new Dog(30.5, 15.5, "brown", "Bob", "laika",
        false, "brown", "15/06/2022", true);
        Animal hen = new Hen(40, 2.5, "brown", 2);
        Animal stork = new Stork(70.7, 6.6, "brown", 2500);
        Animal tiger = new Tiger(100, 150, "green", "India", "19/07/2022");
        Animal wolf = new Wolf(80, 20.5, "green", "Russia", "02/12/2020", false);
        //Menu.menu();
        Animal[] allAnimals = new Animal[]{cat, dog, hen, stork, tiger, wolf};
        Possibility.possibilities(allAnimals);
  }
}
