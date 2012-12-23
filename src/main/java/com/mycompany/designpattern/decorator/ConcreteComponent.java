/**
 * created since 2012-11-29
 */
package com.mycompany.designpattern.decorator;

/**
 * @author Administrator
 * @version $Id: ConcreteComponent.java,v 0.1 2012-11-29 下午11:16:57 Administrator Exp $
 */
public class ConcreteComponent implements Component {

    /**
     * 
     * @see com.mycompany.designpattern.decorator.Component#operate()
     */
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate()");
    }

}
