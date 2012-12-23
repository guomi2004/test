/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.abstractfactory;

/**
 * @author Administrator
 * @version $Id: MacButton.java,v 0.1 2012-11-19 下午09:57:50 Administrator Exp $
 */
public class LinuxButton implements Button {

    /**
     * 
     * @see com.mycompany.designpattern.abstractfactory.Button#show()
     */
    @Override
    public void show() {
        System.out.println("Linux button show");
    }

}
