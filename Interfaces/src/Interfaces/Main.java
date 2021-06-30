package Interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers= {new EmailLogger(),new DatabaseLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer customer =new Customer(1,"enes","ergen");
		customerManager.add(customer);
	}

}
