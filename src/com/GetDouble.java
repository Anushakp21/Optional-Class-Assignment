package com;

import java.util.Optional;

public class GetDouble {
	
	public static double getValueOrDefault(Optional<Double> optionalDouble) {
        return optionalDouble.orElse(100.0);
    }

    public static void main(String[] args) {
        Optional<Double> nonEmptyOptional = Optional.of(45.5);
        Optional<Double> emptyOptional = Optional.empty();

        System.out.println(getValueOrDefault(nonEmptyOptional));
        System.out.println(getValueOrDefault(emptyOptional)); 
    }

}
