package com.cisco.apicem.model.sample_jsonunit_test;

import static net.javacrumbs.jsonunit.core.Option.IGNORING_ARRAY_ORDER;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.javacrumbs.jsonunit.core.Configuration;
import net.javacrumbs.jsonunit.core.internal.Diff;

public class ArraysTest {

		static ObjectMapper mapper = new ObjectMapper();
		
    static void checkArrays() {
    		Map a = new HashMap();
    		Map b = new HashMap();
    		
    		a.put("a",1);
    		a.put("b","b");
    		List l = new ArrayList();
    		Map c = new HashMap();
    		c.put("1", "2");
    		c.put("3", "4");
    		
    		
    		Map c1 = new HashMap();
    		c1.put("5", "6");
    		c1.put("7", "8");
    		
    		l.add(c);
    		l.add(c1);
    		
    		a.put("c", l);
    		
    		
    		
    		b.put("a",10);
    		b.put("b","b");
    		b.put("v","b");
    		List l1 = new ArrayList();
    		c = new HashMap();
    		c.put("1", "2");
    		c.put("3", "4");
    		
    		c1 = new HashMap();
    		c1.put("5", "6");
    		c1.put("7", "8");
    		
    		
    		
    		l1.add(c);
    		l1.add(c1);
    		
    		
    		b.put("c", l1);
    		
    		
    		
        try {

        	//Diff d = Diff.create(mapper.writeValueAsString(a), mapper.writeValueAsString(b), "fullJson", "", Configuration.empty().withOptions(IGNORING_ARRAY_ORDER));
        	Diff d = Diff.create(mapper.writeValueAsString(a), mapper.writeValueAsString(b), "fullJson", "", Configuration.empty().withOptions(IGNORING_ARRAY_ORDER));
        	System.err.println(d.differences());
//					assertJsonEquals(mapper.writeValueAsString(a), mapper.writeValueAsString(b), when(IGNORING_ARRAY_ORDER));
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    }
    
    public static void main(String[] args) {
			ArraysTest.checkArrays();
//			System.out.println("done");
		}
}