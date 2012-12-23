/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.builder;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-19 下午09:49:59 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Director director = new Director();
        
        Builder builderA = new ConcreteBuilderA();
        director.construct(builderA);
        System.out.println(builderA.getResult().toString());
        
        Builder builderB = new ConcreteBuilderB();
        director.construct(builderB);
        System.out.println(builderB.getResult().toString());
        
    }

}
