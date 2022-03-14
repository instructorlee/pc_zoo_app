package main.java.classes;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Comm {
	
	private Scanner in = new Scanner(System.in);
	
	public String[] getRequest(String prompt) {
		// LESSON use recursion to break request into parts
		
		outputLine(prompt);
		
		String[] parts = new String[] { null, null, null };
		String line = in.nextLine().toLowerCase();
		String[] breakDown = line.split("\\s+");
		for ( int x = 0; x < breakDown.length; x ++ ) parts[x] = breakDown[x];
		return parts;
	}
	
	public void close() {
		in.close();
	}
	
	public boolean confirmYesNo(String prompt) {
		return get(prompt + "(y/n)", Arrays.asList("y", "n")).contains("y");
	}
	
	public String get(String prompt, List<String> filter) {
		return get(Arrays.asList(prompt), filter);
	}
	
	public String get(List<String> prompt, List<String> filter) {
		
		String b = " ";
		
		while(!filter.contains(b)) {
			output(prompt);
			b = in.nextLine();
		}
		
		return b;
	}
	
	public String input(String prompt, boolean require) {
		return input(Arrays.asList(prompt), require);
	} 
	
	public String input(List<String> prompt, boolean require) {
		
		String b = "";
		
		while(b == "") {
			output(prompt);
			b = in.nextLine();
		}
		
		return b;
	}
	
	public void output(List<String> lines) {
		System.out.println("\n");
		for (String line : lines) System.out.println(line);
	}
	
	public void outputLine(String line) {
		output(Arrays.asList(line));
	}
}
