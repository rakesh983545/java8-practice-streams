package com.rakesh.streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		
		String[] strings=new String[] {"aa","bb","cc"};
		
		Stream<String> stream=Arrays.stream(strings);
		
		stream.forEach(System.out::println);
		
		Stream<String> st=Stream.of("a","b","c");
		st.forEach(System.out::println);
		
		List<String> list=new ArrayList<>();
		list.add("r");
		list.add("a");
		list.add("k");
		list.add("e");
		list.add("s");
		list.add("h");
		
		Stream<String> st2= list.stream();
		st2.forEach(System.out::println);
		
	}

}
