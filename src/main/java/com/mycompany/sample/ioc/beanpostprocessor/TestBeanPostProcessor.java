/**
 * created since 2012-10-20
 */
package com.mycompany.sample.ioc.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Administrator
 * @version $Id: TestBeanPostProcessor.java,v 0.1 2012-10-20 下午12:49:22 Administrator Exp $
 */
public class TestBeanPostProcessor implements BeanPostProcessor {

    /**
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
                                                                               throws BeansException {
        System.out.println("postProcessBefore:" + beanName);
        return bean;
    }

    /**
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
                                                                              throws BeansException {
        System.out.println("postProcessAfter:" + beanName);
        return bean;
    }

}
