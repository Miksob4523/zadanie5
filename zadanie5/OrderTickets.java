package pl.isa.homeworks.zadanie5;

import java.util.ArrayList;
import java.util.List;

public final class OrderTickets {


    public Order takeOrder(List<Person> people) {
        var order = new Order();
        for (int c = 0; c <= (people.size() - 1); c++) {
            Person person = people.get(c);
            int personAge = person.getAge();
            boolean isLearning = person.isLearning();
            if (personAge <= 5) {
                Ticket ticket1 = new Ticket("free entry ticket", 0);
                order.addTicket(ticket1);
            } else if (personAge < 15) {
                Ticket ticket2 = new Ticket("under 15 ticket", 10);
                order.addTicket(ticket2);
            } else if (personAge < 26 && isLearning) {
                Ticket ticket3 = new Ticket("student ticket", 12);
                order.addTicket(ticket3);
            } else {
                Ticket ticket4 = new Ticket("normal ticket", 15);
                order.addTicket(ticket4);
            }
        }
        return order;
    }
}
