/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.iterator;

/**
 * @author zhangbin
 * @version $Id: ConcreteAggregate.java,v 0.1 2012-12-22 下午01:13:12 zhangbin Exp $
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private Object[] values = new Object[16];

    private int      size;

    /**
     * @return
     * @see com.mycompany.designpattern.iterator.Aggregate#createIterator()
     */
    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
    }

    public void add(Object obj) {
        if (size < 16) {
            values[size++] = obj;
        } else {
            throw new UnsupportedOperationException();
        }

    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i < 16) {
            return (T)values[i];
        } else {
            throw new UnsupportedOperationException();
        }
    }
    
    public int size() {
        return size;
    }
}
