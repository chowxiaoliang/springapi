package com.zl.springapi.service.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final boolean running = true;

    public static void main(String[] args) throws Exception{
        ApplicationContext act = new ClassPathXmlApplicationContext("application.xml");
        logger.debug("spring container is on");
        synchronized (Main.class) {
            while (running) {
                try {
                    Main.class.wait();
                } catch (Throwable e) {
                }
            }
        }

    }
}
