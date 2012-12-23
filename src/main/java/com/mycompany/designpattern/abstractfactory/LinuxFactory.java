/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.abstractfactory;

/**
 * @author Administrator
 * @version $Id: LinuxFactory.java,v 0.1 2012-11-19 下午09:58:35 Administrator Exp $
 */
public class LinuxFactory implements Factory {

    /**
     * @return
     * @see com.mycompany.designpattern.abstractfactory.Factory#createWindow()
     */
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    /**
     * @return
     * @see com.mycompany.designpattern.abstractfactory.Factory#createButton()
     */
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

}
