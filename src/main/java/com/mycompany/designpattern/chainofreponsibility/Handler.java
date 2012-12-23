/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.chainofreponsibility;

/**
 * @author zhangbin
 * @version $Id: Handler.java,v 0.1 2012-12-23 下午01:45:55 zhangbin Exp $
 */
public abstract class Handler {

    protected Handler successor;
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int requester);
}
