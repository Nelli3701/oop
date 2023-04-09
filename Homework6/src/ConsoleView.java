import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean workNotebook;
    private Menu menu;
    View view = new ConsoleView();
    Model model = new Model();

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
   @Override
    public void showOutput(String output) {
        System.out.println(output);
    }
    @Override
    public String getInput(){
        return scanner.nextLine();
    }
    @Override
    public void onClick() {
        workNotebook = true;
        menu = new Menu(this);
        do {
            printMenu();
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            menu.execute(choice);
            }
        while (workNotebook);
    }


    public void printMenu() {
        System.out.println(menu.printMenu());
    }

    public void finish() {
        System.out.println("\nБлокнот закрыт");
        workNotebook = false;
    }

    public void addNote() {
        view.showOutput("Ваша заметка: ");
        presenter.add();
        view.showOutput("Заметка добавлена");
    }
    public void getNotes() {
        System.out.println(presenter.getNotes());
    }
}