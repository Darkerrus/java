package com.company;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	Predicate<Integer> predicate = x -> (x != 0) && ((x & (x - 1)) == 0);
	System.out.println(predicate.test(128));
    }


}
