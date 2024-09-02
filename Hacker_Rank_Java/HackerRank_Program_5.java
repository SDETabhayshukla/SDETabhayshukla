package Hacker_Rank_Java;

import java.io.IOException;
import java.util.Scanner;

public class HackerRank_Program_5 {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            int r = N * i;
            System.out.println(N + " x " + i + " = " + r);
        }
    }

}
