package dodo.learning.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestWithMockito {
    
    
    // mock creation
    List mockedList = mock(List.class);

    @BeforeTest
    public void setup() {
     // stubbing appears before the actual execution
        when(mockedList.get(0)).thenReturn("first");
    }
    
    @Test
    public void testAdd() {
        System.out.println(mockedList.get(0));
    }
    
    
    @AfterTest
    public void tearDown() {
        mockedList.clear();
    }
    

}
