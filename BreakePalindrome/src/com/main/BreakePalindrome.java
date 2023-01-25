package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BreakePalindrome {
	public static void main(String[] args) {
		System.out.println("bab -> " + breakePalindrome("bab"));
		System.out.println("aaa -> " + breakePalindrome("aaa"));
		System.out.println("acca -> " + breakePalindrome("acca"));
		System.out.println("Un putal de a con una b -> " + breakePalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaa"));
		System.out.println("b -> " + breakePalindrome("b"));
	}
	
	private static String breakePalindrome(String palindrome) {
		List<String> list = Arrays.asList(palindrome.split(""));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).charAt(0) != 97) {
				String lastLetter = list.get(i);
				list.set(i, "a");
				String newString = list.stream().map(Object::toString).collect(Collectors.joining(""));
				if(!newString.equals(new StringBuilder(newString).reverse().toString())) {
					return newString;
				}else {
					list.set(i, lastLetter);
				}
			}
		}
		
		return "IMPOSSIBLE";
	}
}