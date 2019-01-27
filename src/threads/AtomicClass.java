/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author David Vera
 */
public class AtomicClass {
    private static AtomicInteger atomicclass = new AtomicInteger(0);
    
    public int nextValue() {
        return atomicclass.incrementAndGet();
    }
    
    public int getValue() {
        return atomicclass.get();
    }
}
