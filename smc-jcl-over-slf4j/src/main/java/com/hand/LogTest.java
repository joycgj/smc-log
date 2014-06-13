package com.hand;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with IntelliJ IDEA.
 * User: chengaojie
 * Date: 14-6-13
 * Time: 下午10:04
 * To change this template use File | Settings | File Templates.
 */
public class LogTest {
    private static final Log Logger = LogFactory.getLog(LogTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Logger.debug("debug...");
            Logger.info("info...");
            Logger.warn("warn...");
            Logger.error("error...");
            Logger.fatal("fatal...");
        }
    }
}
