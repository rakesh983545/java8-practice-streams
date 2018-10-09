package com.rakesh.streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ClientTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("rakesh");
		list.add("manu");
		list.add("gowda");
		list.add("soda");
		list.add("chahiye");
		list.add("kya");
		list.add("tumko0");
		
		//list.forEach(System.out::println);
		/*Stream<String> stream=list.stream();
		Stream<String> distinct=stream.distinct();
		long count=distinct.count();*/
		
		long count=list.stream().distinct().distinct().count();
		
		
		System.out.println(count);
		boolean anyMatch=list.stream().anyMatch(s->s.contains("z"));
		
		System.out.println(anyMatch);
		
	}

}
