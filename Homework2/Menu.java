import java.util.Scanner;
public class Menu {
    public static void menu() {
        boolean start = true;
        Scanner in = new Scanner(System.in);
        while(start){
            System.out.println("Выберите действие: \n1 - Добавить в зоопарк\n2 - Удалить из зоопарка\n" +
                    "3 - Напечатать информацию о животном по его номеру\n4 - Информация обо всех животных в зоопарке\n" +
                    "5 - Заставить животное издать звук(по его номеру)\n" +
                    "6 - Заставить всех животных издавать звук\n7 - Закрыть меню" );
            int choice = in.nextInt();

            if (choice == 1){
                System.out.println("Какое животное хотите добавить? Выберите из имеющихся:" +
                        "cat, dog, hen, stork, tiger, wolf ");
                String an = in.nextLine();
                if (an == "cat")
                Zoo.addAnimal(Cat);
            }
            if (choice == 2){
                System.out.println("Введите индекс животного ");
                int i = in.nextInt();
                Zoo.removeAnimal(i);
            }
            if( choice == 3){
                System.out.println("Введите индекс животного ");
                int i = in.nextInt();
                Zoo.getInfoAboutAnimal(i);
            }
            if (choice == 4){
                Zoo.getInfo(animals);
            }
            if (choice == 5){
                System.out.println("Введите индекс животного ");
                int i = in.nextInt();
                Zoo.getSound(i);
            }
            if (choice == 6){
                Zoo.animals.makeSound();
            }
            if (choice == 7){
                start = false;
            }
            continue;
        }

        in.close();

    }
}
