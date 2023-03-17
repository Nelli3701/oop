import java.util.Scanner;
public class Menu {
    public static void menu() {
        boolean start = true;
        Scanner in = new Scanner(System.in);
        Animal cat = new Cat(20.10, 5, "blue", "Tom", "siberian",
        true, "white", "20/10/2020", true);
        Animal dog = new Dog(30.5, 15.5, "brown", "Bob", "laika",
        false, "brown", "15/06/2022", true);
        Animal hen = new Hen(40, 2.5, "brown", 2);
        Animal stork = new Stork(70.7, 6.6, "brown", 2500);
        Animal tiger = new Tiger(100, 150, "green", "India", "19/07/2022");
        Animal wolf = new Wolf(80, 20.5, "green", "Russia", "02/12/2020", false);
        //Animal[] allAnimals = new Animal[]{cat, dog, hen, stork, tiger, wolf};
        Zoo myZoo = new Zoo();
        //myZoo.addAnimal(cat);
        //Zoo[] zooAnimals = new Zoo[]{myZoo};
        while(start){
            System.out.println("Выберите действие: \n1 - Добавить в зоопарк\n2 - Удалить из зоопарка\n" +
                    "3 - Напечатать информацию о животном по его номеру\n4 - Информация обо всех животных в зоопарке\n" +
                    "5 - Заставить животное издать звук(по его номеру)\n" +
                    "6 - Заставить всех животных издавать звук\n7 - Все способности\n8 - Закрыть меню" );
            int choice = in.nextInt();
            if (choice == 1){
                System.out.println("Какое животное хотите добавить? Выберите из имеющихся:" +
                        "cat, dog, hen, stork, tiger, wolf ");
                in.nextLine();
                String an = in.nextLine();
                    if (an.equals("cat"))
                        myZoo.addAnimal(cat);
                if (an.equals("dog"))
                    myZoo.addAnimal(dog);
                if (an.equals("hen"))
                    myZoo.addAnimal(hen);
                if (an.equals("stork"))
                    myZoo.addAnimal(stork);
                if (an.equals("tiger"))
                    myZoo.addAnimal(tiger);
                if (an.equals("wolf"))
                    myZoo.addAnimal(wolf);
            }
            if (choice == 2){
                System.out.println("Введите индекс животного ");
                int i = in.nextInt();
                myZoo.removeAnimal(i);
            }
            if( choice == 3){
                System.out.println("Введите индекс животного ");
                int i = in.nextInt();
                myZoo.getInfoAboutAnimal(i);
            }
            if (choice == 4){
                System.out.println("Данные о животном");
                myZoo.getInfo();
            }
            if (choice == 5){
                System.out.println("Введите индекс животного ");
                int i = in.nextInt();
                myZoo.getSound(i);
            }
            if (choice == 6){
                myZoo.makeSound();
            }
            if (choice == 7){
                Possibility.possibilities(myZoo.getAnimals());
            }
            if (choice == 8){
                start = false;
            }
        }

        in.close();

    }
}
