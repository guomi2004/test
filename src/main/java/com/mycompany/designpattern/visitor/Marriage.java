/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Marriage.java,v 0.1 2012-12-22 下午02:35:50 zhangbin Exp $
 */
public class Marriage implements Action {

    /**
     * @param man
     * @see com.mycompany.designpattern.visitor.Action#getManConclusion(com.mycompany.designpattern.visitor.Man)
     */
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人恋爱时，凡事不懂也要装懂");
    }

    /**
     * @param woman
     * @see com.mycompany.designpattern.visitor.Action#getWomanConclusion(com.mycompany.designpattern.visitor.Woman)
     */
    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人恋爱时，凡事懂也要装作不懂");
    }

}
