package com;

import java.util.Optional;

public class StringUppercase {
	public static void getUppercase(Optional<String> str)
	{
		str.ifPresentOrElse
		(value -> System.out.println(value.toUpperCase()), 
				  () -> System.out.println("No value"));
	}
	  public static void main(String[] args) {
	        Optional<String> nonEmptyOptional = Optional.of("hello");
	        Optional<String> emptyOptional = Optional.empty();

	        getUppercase(nonEmptyOptional); 
	        getUppercase(emptyOptional); 
	    }

}
