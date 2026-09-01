package eliteTasks;

import java.util.Scanner;

public class ReverseString {
	static String reverseString(String str) {
		String empStr = "";
		for(int i = str.length()-1;i>=0;i--) {
			empStr+=str.charAt(i);
		}
		return empStr;
	}
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter String:");
	String str = Sc.nextLine();	
	System.out.println(ReverseString.reverseString(str));
	Sc.close();
}
}
