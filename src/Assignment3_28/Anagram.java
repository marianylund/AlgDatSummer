package Assignment3_28;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	
	static public boolean hasDuplicateCharsSubStrings(String s) {
		for(int i = s.length(); i >= 0; i--) {
			CharSequence c = s.substring(i-1, i);
			if(s.substring(0, i-1).contains(c)) {
				return true;
			}

		}
		
		return false;
	}
	
	static public boolean hasDuplicateChars(String s) {
		char[] l = s.toCharArray();
		for(int i = 0; i<l.length;i++) {
			for(int j = i+1; j<l.length;j++) {
				if(l[i]==l[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean anagram(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		
		char[] as = a.toCharArray();
		char[] bs = b.toCharArray();
		
		for(int i = 0; i<l.length;i++) {
			for(int j = i+1; j<l.length;j++) {
				if(l[i]==l[j]) {
					return true;
				}
			}
		}
		
		
		
		return false;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		boolean dup = hasDuplicateChars("sd");
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		
		System.out.println(dup + " duration: " + duration);
	}

}
