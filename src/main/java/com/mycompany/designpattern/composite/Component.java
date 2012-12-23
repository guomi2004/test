/**
 * created since 2012-12-2
 */
package com.mycompany.designpattern.composite;

/**
 * @author Administrator
 * @version $Id: Component.java,v 0.1 2012-12-2 上午11:35:47 Administrator Exp $
 */
public abstract class Component {

    protected String name;
    
    public Component(String name) {
        this.name = name;
    }
    
    public abstract void add(Component component);
    
    public abstract void remove(Component component);
    
    public abstract void display(int depth);
    
    protected String newString(String value, int count) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append(value);
        }
        return sb.toString();
    }
}
