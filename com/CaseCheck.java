package com;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }else{
            System.out.println("upper case");
        }

        System.out.println(ch);
    }
}
