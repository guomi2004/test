/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.iterator;

/**
 * @author zhangbin
 * @version $Id: ConcreteIterator.java,v 0.1 2012-12-22 下午01:10:40 zhangbin Exp $
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private Aggregate<T> aggregate;

    private int       index;

    public ConcreteIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    /**
     * @return
     * @see com.mycompany.designpattern.iterator.Iterator#hasNext()
     */
    @Override
    public boolean hasNext() {
        return index < aggregate.size();
    }

    /**
     * @return
     * @see com.mycompany.designpattern.iterator.Iterator#next()
     */
    @Override
    public T next() {
        return (T) aggregate.get(index++);
    }

}
