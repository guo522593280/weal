package com.weal.component.base.util;

import org.springframework.context.ApplicationContext;

/**
*
* @author guogchao
* @createTime
*/
public class SpringBeanUtil {
    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }

    public static Object getBean(Class clazz) {
        return applicationContext.getBean(clazz);
    }
}
