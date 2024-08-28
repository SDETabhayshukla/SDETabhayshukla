package Hacker_Rank_Java;

import java.util.Scanner;

public class HackerRank_Day_1 {
    //Java Stdin and Stdout I

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);

        //Method 1 : Using for Loop
        int n=3;
        for(int i=0; i<n;i++){
            int num = scn.nextInt();
            System.out.println(num);
        }

        //Method 2 : Using While Loop
        // while(scn.hasNextInt()){
        //     int num = scn.nextInt();
        //     System.out.println(num);
    }
}
