package com.robin.springboot04webcrud.config;

import com.robin.springboot04webcrud.filter.MyFilter;
import com.robin.springboot04webcrud.listener.MyListener;
import com.robin.springboot04webcrud.servlet.MyServlet;
import org.apache.catalina.connector.Connector;
// import org.eclipse.jetty.server.Server;
// import io.undertow.Undertow;
// import io.undertow.servlet.api.DeploymentInfo;
import org.springframework.boot.autoconfigure.web.embedded.JettyWebServerFactoryCustomizer;
import org.springframework.boot.autoconfigure.web.servlet.UndertowServletWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.jetty.ConfigurableJettyWebServerFactory;
import org.springframework.boot.web.embedded.jetty.JettyServerCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.servlet.ServletContextListener;
import java.util.Arrays;
import java.util.EventListener;

@Configuration
public class MyServerConfig {
    // register servlet
    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean servletServletRegistrationBean =
                new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
        return servletServletRegistrationBean;
    }

    // register filter
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return filterRegistrationBean;
    }

    // register filter
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean<MyListener> eventListenerServletListenerRegistrationBean =
                new ServletListenerRegistrationBean<>(new MyListener());
        return eventListenerServletListenerRegistrationBean;
    }

    // configure embedded tomcat servlet server
    @Bean
    public TomcatConnectorCustomizer tomcatConnectorCustomizer() {
        return new TomcatConnectorCustomizer() {
            @Override
            public void customize(Connector connector) {
                connector.setPort(8083);
            }
        };
    }

    // @Bean
    // public JettyServerCustomizer jettyServerCustomizer() {
    //     return new JettyServerCustomizer() {
    //         @Override
    //         public void customize(Server server) {
    //
    //         }
    //     };
    // }

    // @Bean
    // public UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer() {
    //     return new UndertowDeploymentInfoCustomizer() {
    //         @Override
    //         public void customize(DeploymentInfo deploymentInfo) {
    //
    //         }
    //     };
    // }
}
