/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.builder;

/**
 * @author Administrator
 * @version $Id: Product.java,v 0.1 2012-11-19 下午09:44:24 Administrator Exp $
 */
public class Product {

    private String partA;

    private String partB;

    
    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "partA: " + partA + ", partB: " + partB;
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

}
