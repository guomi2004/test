/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.abstractfactory;

/**
 * @author Administrator
 * @version $Id: Factory.java,v 0.1 2012-11-19 下午09:54:12 Administrator Exp $
 */
public interface Factory {

    public Window createWindow();
    
    public Button createButton();
}
