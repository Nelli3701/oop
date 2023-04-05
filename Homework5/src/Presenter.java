import java.util.Scanner;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(Model m, View v) {
        model = m;
        this.view = v;
//        view.setPresenter(this);
//        model.setPresenter(this);
    }
    public void start() {

        while (true) {

            view.showOutput("\nВыберите действие:\n1. Добавить заметку\n2. Показать все заметки\n3. Выход");
            String choice = view.getInput();

            switch (choice) {
                case "1":
                    System.out.printf("Ваша заметка: ");
                    model.add(view.getInput());
                    break;
                case "2":
                    model.getNotes();
                    break;
                case "3":
                    view.showOutput("Блокнот закрыт");
                    System.exit(0);
                    break;
                default:
                    view.showOutput("Недопустимый выбор");
            }
        }

    }

}
