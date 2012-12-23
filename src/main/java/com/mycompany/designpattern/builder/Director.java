/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.builder;

/**
 * @author Administrator
 * @version $Id: Director.java,v 0.1 2012-11-19 下午09:45:20 Administrator Exp $
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
