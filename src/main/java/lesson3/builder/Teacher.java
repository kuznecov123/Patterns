package lesson3.builder;

public class Teacher {
 private String position;
 private String firstName;
 private String lastName;

    public String getPosition() {
        return position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Teacher() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final Teacher teacher = new Teacher();

        private Builder() {
        }

        public Builder firstName(String firstName) {
            teacher.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            teacher.lastName = lastName;
            return this;
        }
        public Builder position(String position){
            teacher.position = position;
            return this;
        }

        public Teacher build() {
            return teacher;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "position='" + position + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
