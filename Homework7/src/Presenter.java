public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = new Model();
    }

    public void add() {
        model.add(new Note(view.getInput()));
    }

    public String getNotes() {
        return model.getNotes();
    }
    public void update(int index, String note) {
        model.update(index, new Note(note));
    }
    public void remove(int index) {
        model.remove(index);
    }

}
