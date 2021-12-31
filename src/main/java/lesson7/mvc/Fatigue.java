package lesson7.mvc;

public enum Fatigue {

    ALERT("alert"),
    TIRED("tired"),
    SLEEPING("sleeping");

    private final String title;

    Fatigue(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
