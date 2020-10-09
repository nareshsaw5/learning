package com.in28minutes.spring.basic.springin5steps;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortImpl {
    
    /**
     * Precedence/Priority order for autowiring is 
     * 1. Qualifier -> @Primary -> bean by name
     */
    @Autowired
    @Qualifier(value = "abc")
    SortingAlgorithm heapSort;
    
    
    @Autowired
    PrototypeBean prototypeBean;
    
    
    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }


    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }


    public int[] sort(int[] ar) {
        System.out.println(heapSort);
        return this.heapSort.sort(ar);
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("In postConstruct" + heapSort);
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("In preDestroy SortImpl" + heapSort);
        
    }
    
    

}
