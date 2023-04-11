import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Note> notes;
    public Model() {
        notes = new ArrayList<>();
    }
    // создать запись
    public boolean add(Note note) {
        boolean flag = false;
        if (!notes.contains(note)) {
            notes.add(note);
            flag = true;
        }
        return flag;
    }

    //получить записи
    public String getNotes() {
        if (notes.size() == 0) {
            return "Блокнот пуст";
        } else {
            System.out.println("\nБлокнот заметок:");
            String result = "";
            for (Note note : notes) {
                result += note + "\n";
            }
            return result;
        }
    }

    //изменить запись
    public void update(int index, Note note) {
        notes.set(index, note);
    }

    //удалить запись

    public void remove(int index) {
            notes.remove(index);
    }
}
