/**
 * created since 2012-11-27
 */
package com.mycompany.designpattern.bridge;

/**
 * @author Administrator
 * @version $Id: ConcreteImplementor.java,v 0.1 2012-11-27 下午11:27:53 Administrator Exp $
 */
public class ConcreteImplementorA extends Implementor {

    /**
     * 
     * @see com.mycompany.designpattern.bridge.Implementor#OperationImp()
     */
    @Override
    public void OperationImp() {
        System.out.println("ConcreteImplementorA OperationImp()");
    }

}
