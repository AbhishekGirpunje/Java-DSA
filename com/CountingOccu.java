package com;

import java.util.Scanner;

public class CountingOccu {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int n = 31323;
        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 3){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
