/*HackerRank Program 2 :***
Given an integer N, perform the following conditional actions:
If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20, print Not Weird
*/
package Hacker_Rank_Java;

import java.io.IOException;
import java.util.Scanner;

public class HackerRank_Program_2 {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        if (N % 2 != 0 || N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5 || N > 20) {
            System.out.println("Not Weird");
        }
    }
}
