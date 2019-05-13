
package alpha;
import org.apache.logging.log4j.*;
public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String v[])
	{
		log.debug("I am debugging");
		log.error("It is an error");
		log.info("It is an in formation");
		log.fatal("It is a fatal error");
		log.trace("It is a trace error");
		
	}

}
