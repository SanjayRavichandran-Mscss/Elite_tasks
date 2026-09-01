package eliteTasks;

import java.util.Scanner;

public class CompareTwoStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    	System.out.println("Enter String 1:");
        String str1 = sc.nextLine();
    	System.out.println("Enter String 2:");
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Equal");
        } else if (result < 0) {
            System.out.println("String 1 is smaller");
        } else {
            System.out.println("String 1 is greater");
        }
    }
}