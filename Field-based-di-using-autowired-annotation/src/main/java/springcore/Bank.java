package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	
	@Autowired
	Account account;
	
	public void netBanking() {
		System.out.println("Net Banking enabled");
		System.out.println(account.displayDetails());
	}
}
