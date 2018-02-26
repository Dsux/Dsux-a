package com.juvenxu.mvnbook.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloWorldTest
{
    @Test
    public void testSayHello()
    {
        HelloWorld hw = new HelloWorld();
        
        String result = hw.sayHello();
        assertEquals("hello maven", result);
    }
}