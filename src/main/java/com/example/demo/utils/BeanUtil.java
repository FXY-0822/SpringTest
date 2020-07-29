package com.example.demo.utils;

import com.example.demo.core.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
public class BeanUtil {
    private static final ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);

    public static Object getBean(String beanName){
        return ac.getBean(beanName);

    }

}
