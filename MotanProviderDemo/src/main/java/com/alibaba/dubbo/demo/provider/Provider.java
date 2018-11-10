package com.alibaba.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
        context.start();
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
        System.in.read(); // 按任意键退出
    }
}
