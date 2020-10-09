package dodo.learning.thread;

import java.util.concurrent.Callable;

import org.testng.annotations.Test;

public class ConsumerProducerTest {
    
    @Test
    public void testCallable() {
       
    }


}

class MyCallable implements Callable<String> {
    

    @Override
    public String call() throws Exception {
        return "hello";
    }
}

