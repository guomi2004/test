/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Action.java,v 0.1 2012-12-22 下午02:30:38 zhangbin Exp $
 */
public interface Action {

    public void getManConclusion(Man man);
    
    public void getWomanConclusion(Woman woman);
}
