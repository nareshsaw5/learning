package com.in28minutes.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.basic.Student;

@Configuration
@ComponentScan(value = { "com.example.spring.basic" })

public class SpringIn5StepsApplication {

    static Logger LOG = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

    public static void main_1(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringIn5StepsApplication.class)) {
            SortImpl sorting = context.getBean(SortImpl.class);
            int[] sortedAr = sorting.sort(new int[] { 1, 2, 3, 4, 5 });
            for (int i = 0; i < sortedAr.length; i++) {
                LOG.info("{}", i);
            }

            LOG.info("-----------");
            LOG.info("{}", sorting.getPrototypeBean());
            LOG.info("{}", sorting.getPrototypeBean());

        }
    }

    public static void main_2(String[] arg) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/beans.xml");
        Student st = context.getBean("student1", Student.class);
        LOG.info("student 1 {} ", st.getName());

    }

    public static void main(String[] arg) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
        LOG.info("Student {} ", context.getBean("student1", Student.class));
    }

}
