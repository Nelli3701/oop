public class UpdateNote extends Command{
    public UpdateNote(ConsoleView console) {
        super(console);
    }
    @Override
    public String description() {
        return "Изменить заметку";
    }

    public void execute() {
        getConsole().updateNote();
    }
}
