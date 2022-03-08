package LAB_5_T3;

import java.util.*;

public class main {
	
	public static void main (String[] args) {
		MyString s1 = new MyString(new char[] {'A', 'B', 'C'});
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(1));
		
		MyString s2 = s1.substring(0, 2);
		
		System.out.println(s2.toLowerCase());
		
		char[] chars = MyString.valueOf(345).toChars();
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		}}