package com.rakesh.stream2;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamClient {

	public static void main(String[] args) {
		
		
		Supplier<UUID> randomuuids= UUID::randomUUID;
		Stream<UUID> generate=Stream.generate(randomuuids);
		
		List<UUID> collect=generate.skip(10).limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
