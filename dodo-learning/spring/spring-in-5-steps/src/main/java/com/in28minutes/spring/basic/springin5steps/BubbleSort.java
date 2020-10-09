package com.in28minutes.spring.basic.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BubbleSort implements SortingAlgorithm {
    

    public int[] sort(int[] ar) {
        return ar;
    }

}
