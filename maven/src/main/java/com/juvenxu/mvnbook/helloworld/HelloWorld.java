package com.juvenxu.mvnbook.helloworld;

public class HelloWorld
{
    public String sayHello()
    {
        return "hello maven";
    }
    
    public static void main(String[] args)
    {
        System.out.print(new HelloWorld().sayHello());
    }
}