package Interfaces;

public class CustomerManager {
	private Logger loggers[];
	
	public CustomerManager(Logger loggers[]) {
		this.loggers=loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : "+customer.getFirstName());
		Utils.runLoggers(customer, loggers, customer.getFirstName());
		
	}
	public void delete(Customer customer){
		System.out.println("Müþteri s ilindi : "+customer.getFirstName());
		Utils.runLoggers(customer, loggers, customer.getFirstName());

	}

}
