package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: gaojiechen
 * Date: 14-6-16
 * Time: 下午3:10
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
        logger.debug("Hello world.");
    }
}
