/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.chainofreponsibility;

/**
 * @author zhangbin
 * @version $Id: ConcreteHandler2.java.java,v 0.1 2012-12-23 下午01:49:15 zhangbin Exp $
 */
public class ConcreteHandler3 extends Handler {

    /**
     * @param requester
     * @see com.mycompany.designpattern.chainofreponsibility.Handler#handleRequest(com.mycompany.designpattern.chainofreponsibility.Requester)
     */
    @Override
    public void handleRequest(int requester) {
        
        if (requester >= 20 && requester < 30) {
            System.out.println("requester: " + requester + " ConcreteHandler3 handleRequest()");
        } else {
            successor.handleRequest(requester);
        }
    }

}
