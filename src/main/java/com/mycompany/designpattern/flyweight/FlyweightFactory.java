/**
 * created since 2012-11-20
 */
package com.mycompany.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @version $Id: FlyweightFactory.java,v 0.1 2012-11-20 下午11:33:27 Administrator Exp $
 */
public class FlyweightFactory {

    private Map<String, Flyweight> map = new HashMap<String, Flyweight>();
    
    public FlyweightFactory() {
        map.put("X", new ConcreteFlyweight());
        map.put("Y", new ConcreteFlyweight());
        map.put("Z", new ConcreteFlyweight());
    }
    
    public Flyweight getFlyweight(String key) {
        return map.get(key);
    }
}
