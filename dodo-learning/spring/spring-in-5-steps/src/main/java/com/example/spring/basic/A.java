package com.example.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    /**
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * @param b
     *            the b to set
     */
    public void setB(B b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public C getC() {
        return c;
    }

    /**
     * @param c
     *            the c to set
     */
    public void setC(C c) {
        this.c = c;
    }

    private C c;

    A() {

    }

    @Autowired(required = false)
    A(B b) {
        this.b = b;
    }

    @Autowired(required = false)
    A(C c) {
        this.c = c;
    }

    @Autowired(required = false)
    A(B b, C c) {
        this.b = b;
        this.c = c;
    }

}
