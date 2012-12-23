/**
 * created since 2012-11-29
 */
package com.mycompany.designpattern.decorator;

/**
 * @author Administrator
 * @version $Id: ConcreteDecorator.java,v 0.1 2012-11-29 下午11:22:31 Administrator Exp $
 */
public class ConcreteDecorator extends Decorator {

    /**
     * 
     * @see com.mycompany.designpattern.decorator.Component#operate()
     */
    @Override
    public void operate() {
        System.out.println("ConcreteDecorator operate()");
        component.operate();
    }

}
