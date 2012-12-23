/**
 * created since 2012-11-30
 */
package com.mycompany.designpattern.proxy;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-30 上午12:48:10 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }

}
