package Interfaces;

public class Utils {
	static void runLoggers(Customer customer,Logger[] loggers,String message) {
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}

}
