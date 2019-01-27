/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author David Vera
 */
public class ExecutorClass {
    
    private static Future secondPlayer;
    private static Future thirdPlayer;
    
    AtomicClass atomicclass = new AtomicClass();

    public void ExecutorClass() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable threadOne = new MyNewThread("\nFirst Runner", 5);
        executor.execute(threadOne);
        for(int i = 0; i < 10; i++) {
            if(secondPlayer == null) {
                secondPlayer = executor.submit(new MyNewThread("Runner Two", 5));
            }else {
                secondPlayer = executor.submit(new MyNewThread("Runner Two", i*10));
            }

            if(thirdPlayer == null) {
                thirdPlayer = executor.submit(new MyNewThread("Runner Three", 10));
            }else {
                thirdPlayer = executor.submit(new MyNewThread("Runner Three", i*15));
            }    
            
            if(secondPlayer.get() == null) {
                System.out.println("-------------------------------------------------------------");
                System.out.println(i + 1 + ") Second Thread terminated successfully");
            } else {
                secondPlayer.cancel(true);
            }
            if(thirdPlayer.get() == null) {
                System.out.println(i + 1 + ") Third Thread terminated successfully");
                System.out.println("-------------------------------------------------------------");
            } else {
                thirdPlayer.cancel(true);
            }
        }      
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All threads are finished!");
        System.out.println("A total of " + atomicclass.getValue() + " threads ran successfull!!!");
    }
    
}
