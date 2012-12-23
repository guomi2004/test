/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.template;

/**
 * @author zhangbin
 * @version $Id: ConcreteClass.java,v 0.1 2012-12-23 上午11:44:54 zhangbin Exp $
 */
public class ConcreteClass extends AbstractClass {

    /**
     * 
     * @see com.mycompany.designpattern.template.AbstractClass#primitiveOperation1()
     */
    @Override
    protected void primitiveOperation1() {
        System.out.println("ConcreteClass primitiveOperation1");
    }

    /**
     * 
     * @see com.mycompany.designpattern.template.AbstractClass#primitiveOperation2()
     */
    @Override
    protected void primitiveOperation2() {
        System.out.println("ConcreteClass primitiveOperation2");
    }

}
