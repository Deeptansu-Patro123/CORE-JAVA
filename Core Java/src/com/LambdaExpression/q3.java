package com.LambdaExpression;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class q3 {

	public static void main(String[] args) {
		Supplier<Integer> supplier=()-> Math.max(11,13);
		System.out.println(supplier.get());
		
		Consumer<String> consumer=(String s)-> System.out.println(s);
		consumer.accept("Deeptansu");
		
		Predicate<String> predicate=(String s)-> !s.isEmpty();
		System.out.println(predicate.test("Messi"));
		
		Function<Integer,String> function=(Integer i)-> i>40?"PASS":"FAILED";
		System.out.println(function.apply(5));
		System.out.println(function.apply(50));
	}

}
