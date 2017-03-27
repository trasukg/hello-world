package com.webage.demo.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloWorld {

	HelloWorld UUT=new HelloWorld();
	
	@Test
	public void test() {
		assertEquals("value of message", "Hello World!", UUT.getMessage());
	}

}
