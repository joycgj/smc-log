package com.hand;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: chengaojie
 * Date: 14-6-13
 * Time: 下午10:04
 * To change this template use File | Settings | File Templates.
 */
public class LogTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogTest.class);
        for (int i = 0; i < 10000; i++) {
            logger.debug("debug...");
            logger.info("info...");
            logger.warn("warn...");
            logger.error("error...");
            logger.fatal("fatal...");
        }
    }
}
