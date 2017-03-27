package com.webage.demo.hello;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    public static void main( String[] args )
    {
    	HelloWorld obj=new HelloWorld();
        System.out.println( obj.getMessage() );
    }
    
    public String getMessage() {
    	return "Hello World!";
    }
}
