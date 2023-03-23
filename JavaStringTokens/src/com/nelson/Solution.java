package com.nelson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your Input:");
        String s = scanner.nextLine();
        
        List<String> splitedString = Solution.splitString(s);
        System.out.println(splitedString.size());
        for(String eachElement : splitedString){
            System.out.println(eachElement);
        }
        
        scanner.close();
    }
    
    private static List<String> splitString(String s){
        String[] splitedString = s.split("[^a-zA-Z]+[\\s]*");
        List<String> splitedList = new ArrayList<>();
        
        for(String each : splitedString){
            if(each.length() > 0) splitedList.add(each);
        }
        
        return splitedList;
    }
}
/**
 * Examples of inputs:
 * 
 * 1)He is a very very good boy, isn't he?
 * Expected output:
 * 10
 * He
 * is
 * a
 * very
 * very
 * goob
 * boy
 * isn
 * t
 * he
 * 
 * 
 * 2) Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!
 * Expected output:
 * 21
 * Hello
 * thanks
 * for
 * attempting
 * this
 * problem
 * Hope
 * it
 * will
 * help
 * you
 * to
 * learn
 * java
 * Good
 * luck
 * and
 * have
 * a
 * nice
 * day
 */