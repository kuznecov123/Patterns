package lesson7.mvc;

public enum Nourishment {
    SATURATED("saturated"),
    HUNGRY("hungry"),
    STARVING("starving");

    private final String title;

    Nourishment(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
