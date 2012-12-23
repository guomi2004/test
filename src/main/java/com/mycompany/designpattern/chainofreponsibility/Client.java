/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.chainofreponsibility;

/**
 * @author zhangbin
 * @version $Id: Client.java,v 0.1 2012-12-23 下午01:54:03 zhangbin Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        Handler defaultHandler = new DefaultConcreteHandler();
        
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler3.setSuccessor(defaultHandler);
        
        int[] arr = {15,1,20,50,18};
        
        for (int i : arr) {
            handler1.handleRequest(i);
        }
    }

}
