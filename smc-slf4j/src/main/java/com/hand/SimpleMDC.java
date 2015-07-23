package com.hand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleMDC {
    static public void main(String[] args) throws Exception {

//        // You can put values in the MDC at any time. Before anything else
//        // we put the first name
//        MDC.put("requestId", "ReqId=123456789|");
//
//        Logger logger = LoggerFactory.getLogger(SimpleMDC.class);
//        logger.info("I am not a crook.");
//        logger.info("Attributed to the former US president. 17 Nov 1973.");

        final ThreadLocal<String> tl = new ThreadLocal<String>();

        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    while (true) {
//                        tl.set(Thread.currentThread() + "_chengaojie");
//                        System.out.println(tl.get());
//                        System.out.println(Thread.currentThread().getName());
//                        System.out.println(tl.get());

                        MDC.put("requestId", "ReqId=" + Thread.currentThread().getName() + "|");

                        Logger logger = LoggerFactory.getLogger(SimpleMDC.class);
                        logger.info("I am not a crook.");
                        logger.info("Attributed to the former US president. 17 Nov 1973.");
                    }
                }
            });
        }
    }
}