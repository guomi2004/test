/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

/**
 * @author zhangbin
 * @version $Id: Client.java,v 0.1 2012-12-22 下午02:46:44 zhangbin Exp $
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());
        
        structure.display(new Success());
        
        structure.display(new Fail());
        
        structure.display(new Marriage());
        
    }
}
