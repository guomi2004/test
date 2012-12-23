/**
 * created since 2012-11-27
 */
package com.mycompany.designpattern.bridge;

/**
 * @author Administrator
 * @version $Id: Abstraction.java,v 0.1 2012-11-27 下午11:24:50 Administrator Exp $
 */
public abstract class Abstraction {

    protected Implementor implementor;
    
    public abstract void operate();

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

}
