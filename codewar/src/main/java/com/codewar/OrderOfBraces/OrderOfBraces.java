package com.codewar.OrderOfBraces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class OrderOfBraces {

	static String reduceStr(String str)
	{
		String newStr=str.replace("{}", "").replace("[]", "").replace("()", "");
		if(!newStr.equals(str))
			return reduceStr(newStr);
		return newStr;
		
	}
	public static void main(String[] args) {
		String str = "([{}])";
		String s1=reduceStr(str);
		
		if(s1.length()==0)
			System.out.println("valid");
		else
			System.out.println("invalid");
		//System.out.println("isValid : " + isValid(str));
		/*

		List<Character> listOfChar = new ArrayList<Character>();

		List<Character> listOpen = new ArrayList<Character>();
		List<Character> listClose = new ArrayList<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			char strChar = str.charAt(i);
			System.out.println("strChar : " + strChar);
			listOfChar.add(strChar);
			if(Character.compare(strChar, '[')== 0)
				listOpen.add(strChar);
			else if(Character.compare(strChar, '{')== 0)
				listOpen.add(strChar);
			else if(Character.compare(strChar, '(')== 0)
				listOpen.add(strChar);
			else if(Character.compare(strChar, '}')== 0)
				listClose.add('{');
			else if(Character.compare(strChar, ')')== 0)
				listClose.add('(');
			else if(Character.compare(strChar, ']')== 0)
				listClose.add('[');
			
		}
		
		System.out.println("listOfChar");
		listOfChar.stream().forEach(System.out::println);
		
		System.out.println("listOpen");
		listOpen.stream().forEach(System.out::println);
		
		System.out.println("listClose");
		listClose.stream().forEach(System.out::println);
		//Collections.reverse(listClose);
		System.out.println("listClose");
		listClose.stream().forEach(System.out::println);

		System.out.println(listClose.size());
		if(listOpen.equals(listClose))
			System.out.println("all braces match");
		else {
			if(listOpen.size()==2 || listClose.size()==2)
				System.out.println("braces don't match");
			else {
			Collections.reverse(listClose);
			System.out.println("listClose");
			listClose.stream().forEach(System.out::println);
			if(listOpen.equals(listClose))
				System.out.println("all braces match");
			else
			System.out.println("braces don't match");
			}
		}
		*/	
	}

	  public static boolean isValid(String braces) {
		  if(braces.isBlank() || braces==null)
			  return false;
		  
			List<Character> listOpen = new ArrayList<Character>();
			List<Character> listClose = new ArrayList<Character>();
			
			for (int i = 0; i < braces.length(); i++) {
				char strChar = braces.charAt(i);
				//System.out.println("strChar : " + strChar);
				//listOfChar.add(strChar);
				if(Character.compare(strChar, '[')== 0)
					listOpen.add(strChar);
				else if(Character.compare(strChar, '{')== 0)
					listOpen.add(strChar);
				else if(Character.compare(strChar, '(')== 0)
					listOpen.add(strChar);
				else if(Character.compare(strChar, '}')== 0)
					listClose.add('{');
				else if(Character.compare(strChar, ')')== 0)
					listClose.add('(');
				else if(Character.compare(strChar, ']')== 0)
					listClose.add('[');				
			}
			
			if(listOpen.equals(listClose))
				return true;
			else
			{
				
			}
			Collections.reverse(listClose);
			
			if(listOpen.equals(listClose))
				return true;
			else
				return false;
		  }
	  
}
