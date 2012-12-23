/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.mediator;

/**
 * @author zhangbin
 * @version $Id: ConcreteColleague1.java,v 0.1 2012-12-23 下午12:25:24 zhangbin Exp $
 */
public class ConcreteColleague1 extends Colleague {

    /**
     * @param mediator
     */
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void notifyMsg(String message) {
        System.out.println("同事2说：" + message);
    }
}
