package chapters.introduction;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: gaojiechen
 * Date: 14-6-16
 * Time: 下午3:10
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld3 {
    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.foo");
        Logger barlogger = LoggerFactory.getLogger("com.foo.Bar");
        logger.setLevel(Level.INFO);

        // 该请求有效，因为WARN >= INFO
        logger.warn("Low fuel level.");

        // 该请求无效，因为DEBUG < INFO.
        logger.debug("Starting search for nearest gas station.");

        // 名为"com.foo.Bar"的logger实例barlogger, 从"com.foo"继承级别
        // 因此下面的请求有效，因为INFO >= INFO.
        barlogger.info("Located nearest gas station.");

        // 该请求无效，因为DEBUG < INFO.
        barlogger.debug("Exiting gas station search");
    }
}
