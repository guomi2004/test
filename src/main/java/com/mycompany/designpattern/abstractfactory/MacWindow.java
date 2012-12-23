/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.abstractfactory;

/**
 * @author Administrator
 * @version $Id: MacWindow.java,v 0.1 2012-11-19 下午09:56:10 Administrator Exp $
 */
public class MacWindow implements Window {

    /**
     * 
     * @see com.mycompany.designpattern.abstractfactory.Window#show()
     */
    @Override
    public void show() {
        System.out.println("Mac window show");
    }

}
