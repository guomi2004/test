/**
 * created since 2012-11-29
 */
package com.mycompany.designpattern.decorator;

/**
 * @author Administrator
 * @version $Id: Decorator.java,v 0.1 2012-11-29 下午11:17:39 Administrator Exp $
 */
public abstract class Decorator implements Component {

    protected Component component;
    
    public void decorator(Component component) {
        this.component = component;
    }
}
