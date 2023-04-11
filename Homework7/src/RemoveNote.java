public class RemoveNote extends Command{
    public RemoveNote(ConsoleView console) {
        super(console);
    }
    @Override
    public String description() {
        return "Удалить заметку";
    }

    public void execute() {
        getConsole().removeNote();
    }
}
