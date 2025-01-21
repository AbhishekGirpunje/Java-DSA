import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int employee = in.nextInt();
        System.out.println("Enter department");
        String department = in.next();

        switch (employee) {
            case 1 -> {
                System.out.println("Abhishek");
                System.out.println("Unemployed");
            }
            case 2 -> {
                System.out.println("sahil");
                System.out.println("Unemployed");
            }
            case 3 -> {
                System.out.println("vedant");
                System.out.println("Unemployed");
            }
            case 4 -> {
                switch (department) {
                    case "IT":
                        System.out.println("Sid");
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Rahul");
                        System.out.println("Management department");
                        break;
                }
            }
            case 5 -> {
                System.out.println("mihir");
                System.out.println("Unemployed");
            }
            default -> System.out.println("Invalid employee number");
        }


    }
}
