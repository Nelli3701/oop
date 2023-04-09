public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Model model = new Model();
        new Presenter(view, model);
        view.onClick();
    }
}