/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.iterator;

/**
 * @author zhangbin
 * @version $Id: Iterator.java,v 0.1 2012-12-22 下午01:07:43 zhangbin Exp $
 */
public interface Iterator<T> {

    public boolean hasNext();
    
    public T next();
}
