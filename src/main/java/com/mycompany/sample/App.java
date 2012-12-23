package com.mycompany.sample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.sample.ioc.ExampleBean;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("beans.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(resource);
        AbstractApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
//        PrintService printService = (PrintService) factory.getBean("printService");
//        factory.getBean("printService");
//        printService.print();
        ExampleBean ExampleBean = (ExampleBean) factory.getBean("exampleBean");
        System.out.println(ExampleBean);
        
        //factory.getBean("printService");
        //factory.getBean("testFactoryBean");
        
        factory.close();
    }
}
