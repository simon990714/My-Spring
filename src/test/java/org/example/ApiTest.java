package org.example;

import org.example.bean.UserService;

public class ApiTest {
    public static void main(String[] args) {
        //1.初始化
        BeanFactory beanFactory = new BeanFactory();
        //2.注册
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3.使用
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
