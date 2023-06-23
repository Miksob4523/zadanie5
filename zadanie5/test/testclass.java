package pl.isa.homeworks.zadanie5.test;

import org.junit.Test;
import pl.isa.homeworks.zadanie5.Order;
import pl.isa.homeworks.zadanie5.OrderTickets;
import pl.isa.homeworks.zadanie5.Person;
import pl.isa.homeworks.zadanie5.Ticket;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testclass {
    @Test
    public void test1() {
        List<Ticket> tickets1 = new ArrayList<>();
        Ticket ticket1 = new Ticket("x", 2);
        Order order = new Order();
        tickets1.add(ticket1);
        assertNotEquals(3, order.getTotalPrice(tickets1));

    }

    @Test
    public void test2() {
        Order order = new Order();
        OrderTickets orderTickets = new OrderTickets();
        List<Person> people = new ArrayList<>();
        people.add(new Person(4, false));
        people.add(new Person(15, true));
        people.add(new Person(25, false));
        order.addTicket(new Ticket("free entry ticket", 0));
        order.addTicket(new Ticket("student ticket", 12));
        order.addTicket(new Ticket("normal ticket", 15));

        assertEquals(27, order.getTotalPrice(order.tickets));

    }

    @Test
    public void test3() {
        Order order = new Order();
        OrderTickets orderTickets = new OrderTickets();
        List<Person> people = new ArrayList<>();
        people.add(new Person(4, false));
        people.add(new Person(15, true));
        people.add(new Person(25, false));
        order.addTicket(new Ticket("free entry ticket", 0));
        order.addTicket(new Ticket("student ticket", 12));
        order.addTicket(new Ticket("normal ticket", 15));
        assertEquals(new Ticket("free entry ticket", 0), order.tickets.get(0));
    }

    @Test
    public void test4() {
        Order order = new Order();
        OrderTickets orderTickets = new OrderTickets();
        List<Person> people = new ArrayList<>();
        people.add(new Person(4, false));
        people.add(new Person(15, true));
        people.add(new Person(25, false));
        order.addTicket(new Ticket("free entry ticket", 0));
        order.addTicket(new Ticket("student ticket", 12));
        order.addTicket(new Ticket("normal ticket", 15));
        assertEquals(order, orderTickets.takeOrder(people));

    }

    @Test
    public void test5() {
        Ticket ticket = new Ticket("a", 2);
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket);
        assertNotEquals(new Ticket("c", 2), tickets.get(0));
    }


}
