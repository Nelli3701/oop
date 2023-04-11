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
        String list = model.getNotes();
        if (list.equals("")) {
            return "Блокнот пуст";
        } else {
            return ("\nБлокнот заметок:\n" + list);
        }
        }
    public void update(int index, String note) {
        model.update(index, new Note(note));
    }
    public void remove(int index) {
        model.remove(index);
    }

}
