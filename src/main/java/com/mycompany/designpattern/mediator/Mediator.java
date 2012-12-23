/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.mediator;

/**
 * @author zhangbin
 * @version $Id: Mediator.java,v 0.1 2012-12-23 下午12:19:14 zhangbin Exp $
 */
public class Mediator {

    protected Colleague colleague1;

    protected Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    public void notifyMessage(String message, Colleague colleague) {
        if (colleague1 == colleague) {
            colleague2.notifyMsg(message);
        } else {
            colleague1.notifyMsg(message);
        }
    }
}
