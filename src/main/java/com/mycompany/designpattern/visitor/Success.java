/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Sucess.java,v 0.1 2012-12-22 下午02:35:50 zhangbin Exp $
 */
public class Success implements Action {

    /**
     * @param man
     * @see com.mycompany.designpattern.visitor.Action#getManConclusion(com.mycompany.designpattern.visitor.Man)
     */
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人成功时，背后多半有一个伟大的女人");
    }

    /**
     * @param woman
     * @see com.mycompany.designpattern.visitor.Action#getWomanConclusion(com.mycompany.designpattern.visitor.Woman)
     */
    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人成功时，背后多有一个不成功的男人");
    }

}
