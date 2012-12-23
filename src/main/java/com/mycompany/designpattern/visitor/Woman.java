/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Woman.java,v 0.1 2012-12-22 下午02:33:13 zhangbin Exp $
 */
public class Woman extends Person {

    /**
     * @param action
     * @see com.mycompany.designpattern.visitor.Person#Accept(com.mycompany.designpattern.visitor.Action)
     */
    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }

}
