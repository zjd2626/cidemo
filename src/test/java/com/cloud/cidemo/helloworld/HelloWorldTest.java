package com.cloud.cidemo.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest
{
	@Test
	public void testSay(){
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.say();
		assertEquals("hello maven",result); 
		
	}
}
