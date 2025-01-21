import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit");
//        String fruits = in.next().trim();
//
//        switch (fruits) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("A red fruit");
//            case "Orange" -> System.out.println("orange fruit");
//            default -> System.out.println("Invalid fruit");
//        }
        System.out.println("Enter number you want a day of:");
        int n = in.nextInt();
//        switch (n) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("Sunday");
//        }

        switch (n){
            case 1 ,2 ,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekends");
            default -> System.out.println("Enter in between 1 to 7");
        }


    }
}