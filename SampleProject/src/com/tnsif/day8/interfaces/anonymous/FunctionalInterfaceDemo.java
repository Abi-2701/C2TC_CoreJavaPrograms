package com.tnsif.day8.interfaces.anonymous;

public class FunctionalInterfaceDemo 
{
	public static void main(String[] args)
	{
		GreekClass g=new GreekClass();
		System.out.println(g.geet());
		
		Anonymous g2= new GreetClass();
		{
			@Override
			public String greet(String name)
			{
				return "Welcome to java";
			}
		};
		System.out.println(g2.greet());
		
		//Lambda Expression
		Anonymous g3 =(name)->{
			return "Welcome to Java World"+name;
			
		};
		System.out.println(g2.greet("Abi"));
		}
}