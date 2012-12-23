/**
 * created since 2012-12-2
 */
package com.mycompany.designpattern.composite;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-12-2 上午11:48:25 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        Component compositeA = new Composite("Composite A");
        compositeA.add(new Leaf("Leaf AA"));
        compositeA.add(new Leaf("Leaf AB"));
        
        Component compositeB = new Composite("Composite B");
        compositeB.add(new Leaf("Leaf BA"));
        compositeB.add(new Leaf("Leaf BB"));

        root.add(compositeA);
        root.add(compositeB);
        
        root.display(1);
    }

}
