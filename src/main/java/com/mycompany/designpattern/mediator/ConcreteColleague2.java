/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.mediator;

/**
 * @author zhangbin
 * @version $Id: ConcreteColleague2.java,v 0.1 2012-12-23 下午12:25:24 zhangbin Exp $
 */
public class ConcreteColleague2 extends Colleague {

    /**
     * @param mediator
     */
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void notifyMsg(String message) {
        System.out.println("同事1说：" + message);
    }
}
