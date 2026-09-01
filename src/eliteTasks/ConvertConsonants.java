package eliteTasks;

import java.util.Scanner;

public class ConvertConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result = result + ch;
            } else {
                result = result + "#";
            }
        }

        System.out.println(result);
    }
}