/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.mediator;

/**
 * @author zhangbin
 * @version $Id: Colleague.java,v 0.1 2012-12-23 下午12:19:43 zhangbin Exp $
 */
public abstract class Colleague {

    protected Mediator mediator;
    
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void send(String message) {
        mediator.notifyMessage(message, this);
    }
    
    public abstract void notifyMsg(String message);
}
