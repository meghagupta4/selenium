package beta;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;

public class Demo1 {
	
	//private static Logger log = LogManager.getLogger(Demo.class.getName());
	//private static final Logger logger = LogManager.getLogger(MyApp.class);
	 
	private static Logger log = (Logger) LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		log.debug("Debugging step");
		log.error("Error message");
		log.fatal("Fatal Error");
		log.info("Success");
		
	}

}
