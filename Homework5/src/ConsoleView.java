import java.util.Scanner;

public class ConsoleView implements View {
    private Presenter presenter;
    private Scanner scanner;
   public ConsoleView() {
       scanner = new Scanner(System.in);
   }
    public void showOutput(String output) {
        System.out.println(output);
    }
    public void start() {

        while (true) {

            showOutput("\nВыберите действие:\n1. Добавить заметку\n2. Показать все заметки\n3. Выход");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    presenter.add();
                    break;
                case 2:
                    presenter.getNotes();
                    break;
                case 3:
                    System.out.println("Блокнот закрыт");
                    System.exit(0);
                    break;
                default:
                    showOutput("Недопустимый выбор");
            }
        }

    }
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
