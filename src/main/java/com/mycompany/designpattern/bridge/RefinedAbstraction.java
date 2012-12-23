/**
 * created since 2012-11-27
 */
package com.mycompany.designpattern.bridge;

/**
 * @author Administrator
 * @version $Id: RefinedAbstraction.java,v 0.1 2012-11-27 下午11:27:25 Administrator Exp $
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 
     * @see com.mycompany.designpattern.bridge.Abstraction#operate()
     */
    @Override
    public void operate() {
        System.out.println("RefinedAbstraction operate()");
        super.implementor.OperationImp();
    }

}
