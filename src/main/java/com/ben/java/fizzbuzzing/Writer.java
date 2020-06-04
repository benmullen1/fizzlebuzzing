package com.ben.java.fizzbuzzing;

public class Writer 
{
    public static void write( String[] messages )
    {
		for (String message : messages){
			System.out.println( message + System.lineSeparator() );
		}
    }
}