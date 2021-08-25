package misc.fsc3;

import java.util.Scanner;

public class Session3 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        int option, m, n;


        do {

            System.out.println("\nPlease enter your option:");
            System.out.println("1. Addition\t2. Subtraction");
            System.out.println("3. Armstrong\t4. Prime Factorise");
            System.out.println("5. Chopping\t");
            System.out.println("100. Exit");

            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter the first number:");
                    m = input.nextInt();
                    System.out.println("Please enter the second number:");
                    n = input.nextInt();
                    System.out.println("Result: " + calculator.add(m, n));
                    break;
                case 2:
                    System.out.println("Please enter the first number:");
                    m = input.nextInt();
                    System.out.println("Please enter the second number:");
                    n = input.nextInt();
                    System.out.println("Result: " + calculator.subtract(m, n));
                    break;
                case 3:
                    System.out.println("Please enter the number:");
                    m = input.nextInt();
                    if (calculator.isArmstrong(m)) {
                        System.out.println(m + " is an Armstrong number!");
                    } else {
                        System.out.println(m + " is not an Armstrong number!");
                    }
                    break;
                case 4:
                    System.out.println("Please enter the number:");
                    m = input.nextInt();
                    calculator.primeFactorise(m);
                    break;
                case 5:
                    System.out.println("Please enter the number:");
                    m = input.nextInt();
                    calculator.chopNumbers(m);
                    break;
                case 100:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 100);

    }

    /*




     */
}
