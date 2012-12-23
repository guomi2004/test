/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.iterator;

/**
 * @author zhangbin
 * @version $Id: Client.java,v 0.1 2012-12-22 下午01:22:35 zhangbin Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("sdfdsf1");
        aggregate.add("sdfdsf2");
        aggregate.add("sdfdsf3");
        aggregate.add("sdfdsf4");
        aggregate.add("sdfdsf5");
        
        Iterator<String> it = aggregate.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
