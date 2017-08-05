package com.cloud.cidemo.helloworld;

public class HelloWorld
{
	public String say(){
		return "hello maven";
	}
	public static void main(String[] args){
		System.out.println(new HelloWorld().say());
	}
}
