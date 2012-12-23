/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.builder;

/**
 * @author Administrator
 * @version $Id: Builder.java,v 0.1 2012-11-19 下午09:44:36 Administrator Exp $
 */
public interface Builder {

    void buildPartA();
    
    void buildPartB();
    
    Product getResult();
}
