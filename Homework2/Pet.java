public abstract class Pet extends Animal implements ShowAffection {
    protected String petName;
    protected String kind;
    protected boolean vaccination;
    protected String woolColour;
    protected String birthday;
    public Pet(double height, double weight, String eyesColour, String petName, String kind, boolean vaccination, String woolColour, String birthday) {
        super(height, weight, eyesColour);
        this.petName = petName;
        this.kind = kind;
        this.vaccination = vaccination;
        this.woolColour = woolColour;
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return super.toString() + "кличка: " + petName + "порода: " + kind +
                "наличие прививок :" + vaccination + "цвет шерсти: " + woolColour + "дата рождения: " + birthday;
    }
}
