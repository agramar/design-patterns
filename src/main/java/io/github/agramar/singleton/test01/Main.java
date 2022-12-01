package io.github.agramar.singleton.test01;

public class Main {
    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        int ticketNumber1 = ticketMaker.getNextTicketNumber();
        int ticketNumber2 = ticketMaker.getNextTicketNumber();
        int ticketNumber3 = ticketMaker.getNextTicketNumber();

        System.out.println("ticketNumber1 : " + ticketNumber1);
        System.out.println("ticketNumber2 : " + ticketNumber2);
        System.out.println("ticketNumber3 : " + ticketNumber3);
    }
}