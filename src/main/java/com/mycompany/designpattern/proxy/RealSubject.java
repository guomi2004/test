/**
 * created since 2012-11-30
 */
package com.mycompany.designpattern.proxy;

/**
 * @author Administrator
 * @version $Id: RealSubject.java,v 0.1 2012-11-30 上午12:45:41 Administrator Exp $
 */
public class RealSubject implements Subject {

    /**
     * 
     * @see com.mycompany.designpattern.proxy.Subject#request()
     */
    @Override
    public void request() {
        System.out.println("RealSubject request()");
    }

}
