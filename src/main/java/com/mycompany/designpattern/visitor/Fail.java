/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Fail.java,v 0.1 2012-12-22 下午02:36:21 zhangbin Exp $
 */
public class Fail implements Action{

    /**
     * @param man
     * @see com.mycompany.designpattern.visitor.Action#getManConclusion(com.mycompany.designpattern.visitor.Man)
     */
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人失败时，闷头喝酒，谁也不用劝");
    }

    /**
     * @param woman
     * @see com.mycompany.designpattern.visitor.Action#getWomanConclusion(com.mycompany.designpattern.visitor.Woman)
     */
    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人失败时，眼泪汪汪，谁也劝不了");
    }

}
