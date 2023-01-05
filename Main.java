import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The rectangle");
                    for(int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("The square triangle has botton-left angles");
                    for(int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("The square triangle has botton-right angles");
                    for(int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k < i; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("The square triangle has top-left angles");
                        for(int i = 1; i <= 5; i++) {
                            for (int j = 5; j >= i; j--) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                    System.out.println("The square triangle has top-right angles");
                    for(int i = 1; i <= 5; i++) {
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("The isosceles triangle");
                    for(int i = 1; i <= 7; i++) {
                        for(int j = 6; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for(int k = 1; k < i * 2; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
