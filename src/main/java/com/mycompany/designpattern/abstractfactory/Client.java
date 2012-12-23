/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.abstractfactory;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-19 下午10:00:36 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Factory macFactory = new MacFactory();
        Window macWindow = macFactory.createWindow();
        Button macButton = macFactory.createButton();
        macWindow.show();
        macButton.show();
        
        Factory linuxFactory = new LinuxFactory();
        Window linuxWindow = linuxFactory.createWindow();
        Button linuxButton = linuxFactory.createButton();
        linuxWindow.show();
        linuxButton.show();
    }

}
