package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String v[]) {

		log.info("Beta - Info- Object is present");
		log.debug("Beta - debug- Object is present");

		log.error("Beta - error- Object is present");

		log.trace("Beta - trace- Object is present");

		log.fatal("Beta - fatal- Object is present");

	}

}
