package com.exilant.traing.day002.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileStreamEx {
	
	public static void main(String[] args) throws IOException {
		
		
		Files.list(Paths.get("."))
		.map(Path::getFileName)
		.map(Path::toString)
		.map(String::toUpperCase)
		.filter(name ->name.endsWith(".TXT"))
		.filter(name->name.length()>10)
		.sorted()
		.skip(0)
		.limit(2)
		.map(line->line.toString().matches("Hello"))
		.filter(matches->matches.equals("h"))
		.forEach(System.out::println);
		
		
		
	}
}
