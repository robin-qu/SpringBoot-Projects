package com.robin.springboot04webcrud.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web application has launched!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web application has destroyed!");
    }
}
