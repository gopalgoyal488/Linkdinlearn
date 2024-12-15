package Traning;

import java.util.ArrayList;

public class CompareString {
	
	public static String ps ="this is gopal";
	
	public static String test="Auto@matio123#n";
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	
		String take="QAtest";
	
		CompareString.reverseString();
		
		CompareString.upcase();
		
		CompareString.coutStrting();
		
		CompareString.concentString();
	CompareString.interviewqaString();
		//String reversed= reverseString(take);
		//System.out.println(reversed);
		
	}

	
	public static void reverseString() {
		
		String p ="This is gopal";
		
		String s="this is Gopal";
				
	if(s.equalsIgnoreCase(p)){
		
		System.out.println("pass");
	} 
	else {
		
		System.out.println("fail");
		
	}
	
	}	// TODO Auto-generated method stub
	public static void upcase() {
		
	//	String ps ="this is gopal";
		
String uc=	ps.toUpperCase();

System.out.println(uc);
		
		
		
	}
	public static void coutStrting() {
		
System.out.println(ps.length());
	ps.replaceAll(test, ps)	;	
	}
	
	public static void concentString() {
		
		String us =ps.concat("Hello gopal");
		System.out.println(us);
	}
	
	public static void interviewqaString() {
		
		int letter =0, spericalchar =0, number=0;
		
		for(int i=0; i<test.length();i++)
		{
		char ch=	test.charAt(i);
			if(Character.isDigit(ch)) {
				
				number++;
			}else if(Character.isLetter(ch)) {
				
				letter++;
			}else {
				
				spericalchar++;
			}
		}
		
		System.out.println("number"+ number);
		System.out.println("letter"+ letter);
		System.out.println("spericalchar"+ spericalchar);
		
	}
	
	}
	
		

