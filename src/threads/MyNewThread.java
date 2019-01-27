/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author David Vera
 */
public class MyNewThread implements Runnable {
	
    private String threadName;
    private int count;
    AtomicClass atomicclass = new AtomicClass();

    MyNewThread(String name, int newcount) {
        this.threadName = name;
        this.count = newcount;
    }

    @Override
    public void run() {
        int laps = 0;
        for (int i = 0; i <= this.count; i++) {
            laps =+ i;
        }
        System.out.println(threadName + " ran " + laps + " laps");
        try {
                atomicclass.nextValue();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}
