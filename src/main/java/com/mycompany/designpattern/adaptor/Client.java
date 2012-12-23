/**
 * created since 2012-11-30
 */
package com.mycompany.designpattern.adaptor;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-30 上午12:15:52 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Target target = new Adaptor();
        target.request();
    }

}
