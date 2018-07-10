package com.exilant.traing.day002.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		writeToFile();
		newFileWriter();

		readFile();
	}

	public static void newFileWriter() throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("newSampleFile.txt"))) {
			bw.write("Hello");
			bw.newLine();
			bw.write("World");
		}
	}

	public static void writeToFile() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("sampleDemo.txt"));
			bw.write("Hello");
			bw.newLine();
			bw.write("World");
		} catch (IOException ioe) {

		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void readFile() throws IOException {

		try (BufferedReader bf = new BufferedReader(new FileReader("sampleDemo.txt"))) {

			BufferedReader br= bf;
			br.lines().forEach(System.out::println);
			
			String line;
			StringBuilder sb= new StringBuilder();
			while ((line = bf.readLine()) != null) {
				sb=sb.append(line);
			}
			System.out.println(sb.toString());
			
			
		}

	}
}
