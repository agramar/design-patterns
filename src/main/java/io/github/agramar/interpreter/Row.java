package io.github.agramar.interpreter;

public class Row {
    private final String name;
    private final String surname;

    public Row(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
