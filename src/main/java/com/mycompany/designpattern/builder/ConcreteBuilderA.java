/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.builder;

/**
 * @author Administrator
 * @version $Id: ConcreteBuilderA.java,v 0.1 2012-11-19 下午09:47:25 Administrator Exp $
 */
public class ConcreteBuilderA implements Builder {

    private Product product = new Product();

    /**
     * 
     * @see com.mycompany.designpattern.builder.Builder#buildPartA()
     */
    @Override
    public void buildPartA() {
        product.setPartA("concreteBuilderA partA");
    }

    /**
     * 
     * @see com.mycompany.designpattern.builder.Builder#buildPartB()
     */
    @Override
    public void buildPartB() {
        product.setPartB("concreteBuilderA partB");
    }

    /**
     * @return
     * @see com.mycompany.designpattern.builder.Builder#getResult()
     */
    @Override
    public Product getResult() {
        return product;
    }

}
