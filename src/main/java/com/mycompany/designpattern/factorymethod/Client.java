/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.factorymethod;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-19 下午10:08:31 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.create();
        
        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.create();
    }

}
