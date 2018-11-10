package com.alibaba.dubbo.demo.consumer;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.demo.DemoService;
 
public class Consumer {
    public static void main(String[] args) throws Exception, BeansException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world333"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
