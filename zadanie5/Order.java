package pl.isa.homeworks.zadanie5;

import java.util.ArrayList;
import java.util.List;

public class Order {
List<Ticket> tickets = new ArrayList<Ticket>();
    public int orderPrice = 0;
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public int getTotalPrice() {
        for (int c = 0; c<(tickets.size()+1); c++){
            orderPrice = orderPrice + tickets.get(c).getPrice();
        }
        return orderPrice;
    }
}
