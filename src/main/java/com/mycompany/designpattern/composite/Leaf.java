/**
 * created since 2012-12-2
 */
package com.mycompany.designpattern.composite;

/**
 * @author Administrator
 * @version $Id: Left.java,v 0.1 2012-12-2 上午11:36:51 Administrator Exp $
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    /**
     * @param component
     * @see com.mycompany.designpattern.composite.Component#add(com.mycompany.designpattern.composite.Component)
     */
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("不支持新增操作");
    }

    /**
     * @param component
     * @see com.mycompany.designpattern.composite.Component#remove(com.mycompany.designpattern.composite.Component)
     */
    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    /**
     * @param n
     * @see com.mycompany.designpattern.composite.Component#display(int)
     */
    @Override
    public void display(int depth) {
        System.out.println(newString("-", depth) + name);
    }

}
