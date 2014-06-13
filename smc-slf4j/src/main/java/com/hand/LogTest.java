package com.hand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: chengaojie
 * Date: 14-6-13
 * Time: 下午10:04
 * To change this template use File | Settings | File Templates.
 */
public class LogTest {
    private static final Logger Logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Logger.debug("debug...");
            Logger.info("info...");
            Logger.warn("warn...");
            Logger.error("error...");
        }
    }
}
