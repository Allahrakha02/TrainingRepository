package com.exilant.traing.day002.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.exilant.traing.day002.stats.Dragons;

public class DragonsControlle {

	
	public static void main(String[] args) {
	
		
		List<Dragons> dragons=Stream.of(
				new Dragons("Eroll", "USA", 15),
				new Dragons("Eroll", "USA", 33),
				new Dragons("FIRMAN", "USA", 5),
				new Dragons("Hassal", "France", 12),
				new Dragons("IceFare", "France", 3))
				.collect(Collectors.toList());
		
		
		Map<String, Long> dragonMap=dragons.stream().collect(Collectors.groupingBy(Dragons::getName,Collectors.counting()));
		System.out.println(dragonMap);
		Map<String, Integer> dragonMap2=dragons.stream().collect(Collectors.groupingBy(Dragons::getName,Collectors.summingInt(Dragons::getCount)));
		System.out.println(dragonMap2);
		
		
		
		dragonMap2.forEach((k,v)->{
			System.out.println("Dragon name : "+k+" Dragon VAlue : "+v);
			
			
			
		});
		
		//Map<String, Integer> dragonMap_sum=dragons.stream().collect(Collectors.groupingBy(Dragons::getCount,Collectors.summingInt(Dragons::getCount)));
		int numbers=dragons.stream().collect(Collectors.summingInt(Dragons::getCount));
		System.out.println("Total Dragon "+numbers);
		Double avg=dragons.stream().collect(Collectors.averagingInt((Dragons::getCount)));
		System.out.println("Avarage :"+avg);
		
	Optional<Dragons> min=dragons.stream().collect(Collectors.minBy(Comparator.comparing(Dragons::getCount)));
	Optional<Dragons> max=dragons.stream().collect(Collectors.maxBy(Comparator.comparing(Dragons::getCount)));
	
	System.out.println("Minimum"+min);
	System.out.println("Maximum"+max);
		
	}
	
	
	
}
