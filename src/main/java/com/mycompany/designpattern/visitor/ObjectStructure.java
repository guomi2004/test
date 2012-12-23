/**
 * created since 2012-12-22
 */
package com.mycompany.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbin
 * @version $Id: ObjectStructure.java,v 0.1 2012-12-22 下午02:43:38 zhangbin Exp $
 */
public class ObjectStructure {

    List<Person> list = new ArrayList<Person>();
    
    public void attach(Person person) {
        list.add(person);
    }
    
    public void detach(Person person) {
        list.remove(person);
    }
    public void display(Action visitor) {
        for (Person person : list) {
            person.accept(visitor);
        }
    }
}
