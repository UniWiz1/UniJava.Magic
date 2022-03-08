package LAB_5_T3;

import java.util.*;

public class MyString {

	char chars[];
	
	public MyString(char[] chars) {
		this.chars = chars;
	}
	
	public char charAt(int index) {
		return chars[index];
	}
	
	public int length(){
		
		int count = 0;
		
		for(int i = 0; i < chars.length; i++) {
			count++;
		}
		return count;
	}
	
	public MyString substring(int begin, int end) {
		
		int length;
		length = end - begin;
		
		char[] subString = new char[length];
		
		for(int i=0; i<length; i++) {
			subString[i] = chars[begin];
			begin++;		
		}
		return new MyString(subString);
	}
	
	public MyString toLowerCase() {
		
		int length =length();
		
		char[] toLower = new char[length];
		
		for(int i = 0; i < length; i++ ) {
			toLower[i] = (char)(chars [i]+32);}
			return new MyString(toLower);
		}
	
	public boolean equals(MyString s) {
		
		int lengthOfString = length();
	
		if(lengthOfString != s.length()) {
			return false;
		}
		else {
			for (int i = 0 ; i<lengthOfString; i++) {
				if (chars[i] != s.chars[i])
					return false;
			}
		}
		return true;
	}
	
	
	public static MyString valueOf(int i) {
		
		int number = i;
		int len = 0;
		while(number > 0) {
			number=number/10;
			len++;
		}
		char[] valueOf = new char[len];
			
	number = i;
	//Iterate the loop
	for (int k = len - 1; k>=0; k--) {
	valueOf[k] = (char) ( (number % 10) + '0') ;
	number = number / 10;
	}
	return new MyString (valueOf);
	}
	
	public char[] toChars() {
		return chars;
		
	}
	
public MyString toUpperCase() {
		
		int len =length();
		
		char[] toUpper = new char[len];
		
		for(int i = 0; i < len; i++ ) {
			toUpper[i] = (char)(chars [i]-32);}
			return new MyString(toUpper);
		}
	}