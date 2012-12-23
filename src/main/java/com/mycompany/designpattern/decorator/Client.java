/**
 * created since 2012-11-29
 */
package com.mycompany.designpattern.decorator;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-29 下午11:23:29 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator();
        
        decorator.decorator(component);
        
        decorator.operate();
    }

}
