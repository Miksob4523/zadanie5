package pl.isa.homeworks.zadanie5;

public class Person {
    private int age;
    private boolean isLearning;

    public Person(int age, boolean isLearning) {
        this.age = age;
        this.isLearning = isLearning;
    }

    public int getAge() {
        return age;
    }

    public boolean isLearning() {
        return isLearning;
    }
}
