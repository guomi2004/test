/**
 * created since 2012-11-3
 */
package com.mycompany.sample.ioc;

/**
 * @author Administrator
 * @version $Id: Bar.java,v 0.1 2012-11-3 下午03:26:53 Administrator Exp $
 */
public class Bar {

    private Baz baz;

    public Bar() {
        System.out.println("Bar constructor");
    }
    
    public void setBaz(Baz baz) {
        this.baz = baz;
        System.out.println("baz setter");
    }
}
