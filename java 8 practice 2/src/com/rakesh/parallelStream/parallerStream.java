package com.rakesh.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class parallerStream {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student("rakesh",22));
		list.add(new Student("shilpa",23));
		list.add(new Student("pandey",21));
		
		//list.forEach(System.out::println);
		Stream<Student> stream=list.parallelStream();
		//stream.forEach(System.out::println);
		stream.forEach((s)->doProcess(s));
	}

	private static void doProcess(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

}
