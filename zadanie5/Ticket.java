package pl.isa.homeworks.zadanie5;

public class Ticket {
    private String name;
    private int price;

    public Ticket(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
