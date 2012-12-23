/**
 * created since 2012-11-3
 */
package com.mycompany.sample.ioc;

/**
 * @author Administrator
 * @version $Id: Baz.java,v 0.1 2012-11-3 下午03:27:00 Administrator Exp $
 */
public class Baz {

    private Bar bar;

    public Baz() {
        System.out.println("baz constructor");
    }
    
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("bar setter");
    }
    
}
