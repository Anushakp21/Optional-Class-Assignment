package com;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getOptional(String input)
	{
		return Optional.ofNullable(input);
	}
	public static void main(String[] args) {
		String val="Hello";
		String val1=null;
		System.out.println(getOptional(val).get());
		System.out.println(getOptional(val1));
	}
}
