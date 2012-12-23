/**
 * created since 2012-11-3
 */
package com.mycompany.sample.ioc;

/**
 * @author Administrator
 * @version $Id: ExampleBean.java,v 0.1 2012-11-3 下午04:37:06 Administrator Exp $
 */
public class ExampleBean {

    public static ExampleBean createInstance(Bar bar, int i) {
        System.out.println(String.format("bar:%s, i:%s", bar, i));
        return new ExampleBean();
    }
}
