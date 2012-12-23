/**
 * created since 2012-11-30
 */
package com.mycompany.designpattern.adaptor;

/**
 * @author Administrator
 * @version $Id: Adaptor.java,v 0.1 2012-11-30 上午12:13:48 Administrator Exp $
 */
public class Adaptor extends Target {

    private Adaptee adaptee = new Adaptee();
    
    @Override
    public void request() {
        adaptee.request();
    }
}
