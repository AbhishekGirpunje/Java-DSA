package com;

public class reverse {
    public static void main(String[] args) {
        int a = 12345;
        int ans = 0;

        while(a > 0){
            int rem = a % 10; //5
            a = a / 10 ;//1234
             ans = ans * 10 + rem;
        }
        System.out.println(ans);


    }
}
