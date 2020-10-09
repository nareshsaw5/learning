package com.in28minutes.spring.basic.springin5steps;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="abc")
public class HeapSort implements SortingAlgorithm {
    
    public int[] sort(int[] ar) {
        return ar;
    }
    
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("In preDestroy HeapSort");
        
    }

}
