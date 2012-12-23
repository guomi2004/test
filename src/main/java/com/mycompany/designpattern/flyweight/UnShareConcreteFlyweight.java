/**
 * created since 2012-11-20
 */
package com.mycompany.designpattern.flyweight;

/**
 * @author Administrator
 * @version $Id: ConcreteFlyweight.java,v 0.1 2012-11-20 下午11:32:18 Administrator Exp $
 */
public class UnShareConcreteFlyweight implements Flyweight {

    /**
     * @param i
     * @see com.mycompany.designpattern.flyweight.Flyweight#operate(int)
     */
    @Override
    public void operate(int i) {
        System.out.println("不共享flyweight: " + i);
    }

}
