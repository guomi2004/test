/**
 * created since 2012-11-30
 */
package com.mycompany.designpattern.proxy;

/**
 * @author Administrator
 * @version $Id: Proxy.java,v 0.1 2012-11-30 上午12:46:15 Administrator Exp $
 */
public class Proxy implements Subject {

    private Subject subject;
    
    public Proxy() {
        this.subject = new RealSubject();
    }
    /**
     * 
     * @see com.mycompany.designpattern.proxy.Subject#request()
     */
    @Override
    public void request() {
        System.out.println("Proxy request() before");
        subject.request();
        System.out.println("Proxy request() after");
    }

}
