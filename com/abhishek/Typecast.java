

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);


        // Typecasting
        int num =(int) (69.99f);
        System.out.println(num);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)a; // 257 % 256 = 1
//
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/100;
//
//        System.out.println(d);

        int number = 'a';//UNICODE
        System.out.println(number);

    }
}
