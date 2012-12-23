/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.mediator;

/**
 * @author zhangbin
 * @version $Id: Client.java,v 0.1 2012-12-23 下午12:27:34 zhangbin Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);
        
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        
        colleague1.send("你吃饭了吗?");
        colleague2.send("没吃呢，你要请客吗?");
    }

}
