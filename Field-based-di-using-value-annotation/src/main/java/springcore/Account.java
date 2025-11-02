package springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	@Value("123456789")
	long accNumber;
	@Value("Sunil")
	String accHolder;
	@Value("50000")
	double balance;
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

}
