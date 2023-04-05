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
    public void add() {
        model.add(view.getNote());
    }

}
