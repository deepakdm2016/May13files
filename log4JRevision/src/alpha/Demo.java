package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String v[]) {

		log.info("Info- Object is present");
		log.debug("debug- Object is present");

		log.error("error- Object is present");

		log.trace("trace- Object is present");

		log.fatal("fatal- Object is present");

	}

}
