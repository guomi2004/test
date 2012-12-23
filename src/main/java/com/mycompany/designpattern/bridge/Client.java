/**
 * created since 2012-11-27
 */
package com.mycompany.designpattern.bridge;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-27 下午11:29:24 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Abstraction abs = new RefinedAbstraction();
        Implementor implA = new ConcreteImplementorA();
        Implementor implB = new ConcreteImplementorB();
        
        abs.setImplementor(implA);
        abs.operate();
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        abs.setImplementor(implB);
        abs.operate();
    }

}
