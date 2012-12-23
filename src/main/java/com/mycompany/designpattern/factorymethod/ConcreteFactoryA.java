/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.factorymethod;

/**
 * @author Administrator
 * @version $Id: ConcreteFactoryA.java,v 0.1 2012-11-19 下午10:07:50 Administrator Exp $
 */
public class ConcreteFactoryA implements Factory {

    /**
     * @return
     * @see com.mycompany.designpattern.factorymethod.Factory#create()
     */
    @Override
    public Product create() {
        return new ProductA();
    }

}
