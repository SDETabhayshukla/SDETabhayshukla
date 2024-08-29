/*
Task
In this challenge, you must read  integers from stdin and then print them to stdout.
Each integer must be printed on a new line.
Input Format
There are  lines of input, and each line contains a single integer.
Sample Input
42
100
125
Sample Output
42
100
125
*/

package Hacker_Rank_Java;

import java.util.Scanner;

public class HackerRank_Program_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Method 1 : Using for Loop
        int n = 3;
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();
            System.out.println(num);
        }

        //Method 2 : Using While loop
        // while(scn.hasNextInt()){
        //     int num = scn.nextInt();
        //     System.out.println(num);
    }
}
