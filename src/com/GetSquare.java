package com;

import java.util.Optional;

public class GetSquare {
	public static int getMultipliedValueOrZero(Optional<Integer> optionalInteger) {
		return optionalInteger.map(n -> n * 10).orElse(0);
	}

	public static void main(String[] args) {
		Optional<Integer> nonEmptyOptional = Optional.of(5);
		Optional<Integer> emptyOptional = Optional.empty();

		System.out.println(getMultipliedValueOrZero(nonEmptyOptional)); 

		System.out.println(getMultipliedValueOrZero(emptyOptional)); 
	}
}
