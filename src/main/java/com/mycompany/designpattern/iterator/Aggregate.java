/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.iterator;

/**
 * @author zhangbin
 * @version $Id: Aggregate.java,v 0.1 2012-12-22 下午01:08:50 zhangbin Exp $
 */
public interface Aggregate<T> {

    public Iterator<T> createIterator();

    public void add(T obj);

    public T get(int i);

    public int size();
}
