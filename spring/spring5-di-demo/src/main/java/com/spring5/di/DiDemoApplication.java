package com.spring5.di;

import com.spring5.di.config.PropertyConfig;
import com.spring5.di.controller.ConstructorInjectedController;
import com.spring5.di.controller.MyController;
import com.spring5.di.controller.PropertyInjectedController;
import com.spring5.di.controller.SetterInjectedController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication

public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        PropertyConfig propertyConfig = (PropertyConfig) ctx.getBean("propertyConfig");
        System.out.println(propertyConfig.getMyMessage());
        System.out.println(propertyConfig.getOtherMessage());

    }
}
