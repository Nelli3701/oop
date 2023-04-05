import java.util.Scanner;

public class ConsoleView implements View {
    //private Presenter presenter;
    private Scanner scanner;
   public ConsoleView() {
       scanner = new Scanner(System.in);
   }
   @Override
    public void showOutput(String output) {
        System.out.println(output);
    }
    @Override
    public String getInput(){
        return scanner.nextLine();
    }
//    @Override
//    public void setPresenter(Presenter presenter) {
//        this.presenter = presenter;
//    }
}