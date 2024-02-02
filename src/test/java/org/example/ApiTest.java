package org.example;

import org.example.bean.UserService;
import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        //1.初始化beanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        defaultListableBeanFactory.registerBeanDefinition("userService",beanDefinition);
        //3.第一次获取bean
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) defaultListableBeanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
