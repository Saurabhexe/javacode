package conditionalsloops;

import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = var.nextInt();

        if (age > 0) {
            if (age > 18) {
                System.out.println("you are adult");
            } else {
                System.out.println("you are litle child!");
            }

        } else {
            System.out.println("error");

        }
    }
}
