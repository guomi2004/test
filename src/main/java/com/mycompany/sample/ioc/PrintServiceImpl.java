/**
 * created since 2012-10-1
 */
package com.mycompany.sample.ioc;

import java.util.List;

/**
 * @author Administrator
 * @version $Id: PrintServiceIMpl.java,v 0.1 2012-10-1 下午05:21:54 Administrator Exp $
 */
public class PrintServiceImpl implements PrintService {

    private List<List<String>> name;
    
    public PrintServiceImpl() {
        System.out.println("PrintServiceImpl instance");
    }
    /**
     * 
     * @see com.mycompany.sample.ioc.PrintService#print()
     */
    @Override
    public void print() {
        System.out.println("sdfsdfdsfsdf: " + name);
    }

    public void setName(List<List<String>> name) {
        this.name = name;
    }

}
