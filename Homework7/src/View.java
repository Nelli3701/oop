public interface View {
    void showOutput(String output);
    String getInput();
    void setPresenter(Presenter presenter);
    void onClick();
}
