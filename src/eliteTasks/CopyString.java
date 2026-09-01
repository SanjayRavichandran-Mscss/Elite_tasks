package eliteTasks;

import java.util.Scanner;

public class CopyString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str1 = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            str2 = str2 + str1.charAt(i);
        }

        System.out.println(str2);
    }
}