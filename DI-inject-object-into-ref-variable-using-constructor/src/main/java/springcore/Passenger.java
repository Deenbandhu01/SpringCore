package springcore;

public class Passenger {
	Ticket ticket;
	
	public Passenger(Ticket ticket) {
		this.ticket = ticket;
	}

	public void travel() {
		ticket.bookTicket();
		System.out.println("Passenger is travelling");
	}
}
