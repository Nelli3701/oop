public interface View {
    void showOutput(String output);
    public String getInput();
    void setPresenter(Presenter presenter);
    void onClick();
    String getNote();
    //void setNode(String value);
}
