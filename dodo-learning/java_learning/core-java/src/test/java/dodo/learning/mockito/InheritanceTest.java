package dodo.learning.mockito;

import org.testng.annotations.Test;

import dodo.learning.SubClass;

public class InheritanceTest {
    
    
    @Test
    public void testSuperSub() {
        SubClass _sub = new SubClass();
        _sub.test();
    }

}
