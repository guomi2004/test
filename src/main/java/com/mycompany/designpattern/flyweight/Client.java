/**
 * created since 2012-11-20
 */
package com.mycompany.designpattern.flyweight;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-20 下午11:35:58 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i = 20;
        
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("X");
        flyweight1.operate(--i);
        
        Flyweight flyweight2 = factory.getFlyweight("Y");
        flyweight2.operate(--i);
        
        Flyweight flyweight3 = factory.getFlyweight("Z");
        flyweight3.operate(--i);
    }

}
