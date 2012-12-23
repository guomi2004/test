/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.chainofreponsibility;

/**
 * @author zhangbin
 * @version $Id: ConcreteHandler1.java,v 0.1 2012-12-23 下午01:49:15 zhangbin Exp $
 */
public class ConcreteHandler1 extends Handler {

    /**
     * @param requester
     * @see com.mycompany.designpattern.chainofreponsibility.Handler#handleRequest(com.mycompany.designpattern.chainofreponsibility.Requester)
     */
    @Override
    public void handleRequest(int requester) {
        
        if (requester < 10) {
            System.out.println("requester: " + requester + " ConcreteHandler1 handleRequest()");
        } else {
            successor.handleRequest(requester);
        }
    }

}
