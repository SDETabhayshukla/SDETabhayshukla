package Hacker_Rank_Java;

import java.util.Scanner;

public class HackerRank_Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
        }
        System.out.println("================================");

        sc.close();
    }
}
