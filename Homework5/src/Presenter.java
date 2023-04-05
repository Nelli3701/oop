import java.util.Scanner;

public class Presenter {
    ConsoleView view;
    Model model;

    public Presenter(Model m, ConsoleView v) {
        model = m;
        view = v;
        view.setPresenter(this);
        model.setPresenter(this);
    }
    public boolean add() {
        System.out.println("\nВведите текст заметки:");
        Scanner scanner = new Scanner(System.in);
        Notebook.add(scanner.nextLine());
    }

}
