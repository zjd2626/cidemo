package com.cloud.cidemo;

public class HelloWord
{
	public String say(){
		return "hello maven";
	}
	public static void main(String[] args){
		System.out.println(new HelloWord().say());
	}
}
