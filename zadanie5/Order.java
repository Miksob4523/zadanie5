package pl.isa.homeworks.zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
public List<Ticket> tickets = new ArrayList<>();
    public int orderPrice = 0;
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return orderPrice == order.orderPrice && Objects.equals(tickets, order.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickets, orderPrice);
    }

    public int getTotalPrice(List<Ticket> tickets) {
        for (int c = 0; c <= tickets.size()-1; c++){
            orderPrice = orderPrice + tickets.get(c).getPrice();
        }
        return orderPrice;
    }
}
