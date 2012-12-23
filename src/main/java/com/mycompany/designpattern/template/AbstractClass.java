/**
 * created since 2012-12-23
 */
package com.mycompany.designpattern.template;

/**
 * @author zhangbin
 * @version $Id: AbstractClass.java,v 0.1 2012-12-23 上午11:43:38 zhangbin Exp $
 */
public abstract class AbstractClass {

    public void templateMethod() {
        this.primitiveOperation1();
        this.primitiveOperation2();
    }
    
    protected abstract void primitiveOperation1();
    
    protected abstract void primitiveOperation2();
}
