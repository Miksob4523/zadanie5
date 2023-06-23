package pl.isa.homeworks.zadanie5;

import java.util.Objects;

public class Ticket {
    private final String name;
    private final int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;
        return getPrice() == ticket.getPrice() && Objects.equals(getName(), ticket.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

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
