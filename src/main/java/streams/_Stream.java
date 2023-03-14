package streams;

import imperative.Main;

public class _Stream {

    public static void main(String[] args) {

    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Main.Gender gender;

        Person(String name, Main.Gender gender) {
            this.name = name;
            this.gender = gender;
        }
}
