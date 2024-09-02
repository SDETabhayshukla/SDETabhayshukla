package Hacker_Rank_Java;

import java.util.Scanner;

public class HackerRank_Program_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int q = scn.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int n = scn.nextInt();

            int sum = a;
            int powerOfTwo = 1;

            for (int j = 0; j < n; j++) {
                sum += powerOfTwo * b;
                System.out.print(sum + " ");
                powerOfTwo *= 2;
            }
            System.out.println();
        }
        scn.close();

    }
}
