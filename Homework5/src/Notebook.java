import java.util.ArrayList;
import java.util.List;

public class Notebook implements Model {
    private List<Note> notes;
    public Notebook() {
        notes = new ArrayList<Note>();
    }
    // создать запись
    @Override
    public boolean add(Note note) {
        boolean flag = false;
        if (!notes.contains(note)) {
            notes.add(note);
            flag = true;
        }
        return flag;
    }

    //получить записи
    @Override
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
}
