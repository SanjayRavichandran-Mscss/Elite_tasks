package eliteTasks;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (count[ch] != 0) {
                System.out.print(ch + "=" + count[ch] + ", ");
                count[ch] = 0;
            }
        }
    }
}