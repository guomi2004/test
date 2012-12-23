/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.template;

/**
 * @author zhangbin
 * @version $Id: Client.java,v 0.1 2012-12-23 上午11:45:44 zhangbin Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractClass clazz = new ConcreteClass();
        clazz.templateMethod();
    }

}
