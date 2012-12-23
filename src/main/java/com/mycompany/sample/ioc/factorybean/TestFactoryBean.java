/**
 * created since 2012-10-20
 */
package com.mycompany.sample.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Administrator
 * @version $Id: TestFactoryBean.java,v 0.1 2012-10-20 下午12:00:41 Administrator Exp $
 */
public class TestFactoryBean implements FactoryBean<TestBean> {

    public TestFactoryBean() {
        System.out.println("TestFactoryBean");
    }
    
    public void init() {
        System.out.println("TestFactoryBean init");
    }
    /**
     * @return
     * @throws Exception
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    @Override
    public TestBean getObject() throws Exception {
        return new TestBean();
    }

    /**
     * @return
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @Override
    public Class<?> getObjectType() {
        return TestBean.class;
    }

    /**
     * @return
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    @Override
    public boolean isSingleton() {
        return true;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "objectType: " + getObjectType() + ", isSingleton: " + isSingleton();
    }
}
