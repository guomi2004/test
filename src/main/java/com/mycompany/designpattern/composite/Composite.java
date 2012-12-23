/**
 * created since 2012-12-2
 */
package com.mycompany.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version $Id: Composite.java,v 0.1 2012-12-2 上午11:43:25 Administrator Exp $
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    /**
     * @param component
     * @see com.mycompany.designpattern.composite.Component#add(com.mycompany.designpattern.composite.Component)
     */
    @Override
    public void add(Component component) {
        list.add(component);
    }

    /**
     * @param component
     * @see com.mycompany.designpattern.composite.Component#remove(com.mycompany.designpattern.composite.Component)
     */
    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    /**
     * @param n
     * @see com.mycompany.designpattern.composite.Component#display(int)
     */
    @Override
    public void display(int depth) {
        System.out.println(newString("-", depth) + name);
        for (Component component : list) {
            component.display(depth + 2);
        }
    }

}
