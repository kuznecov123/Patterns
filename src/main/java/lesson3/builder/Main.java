package lesson3.builder;

public class Main {
    public static void main(String[] args) {
        final Teacher teacher = Teacher.builder()
                .firstName("Andrew")
                .lastName("Antonov")
                .position("physicist")
                .build();
        System.out.println(teacher);
    }
}
