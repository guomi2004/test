/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Person.java,v 0.1 2012-12-22 下午02:30:05 zhangbin Exp $
 */
public abstract class Person {

    public abstract void accept(Action action);
}
