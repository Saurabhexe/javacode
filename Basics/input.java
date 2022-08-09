package Basics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter your goodname:");
        String username =  var.nextLine();
        System.out.println("nice to meet you "+username);
    }
}

// String username =  var.nextLine();
// int username =  var.nextInt();
// boolean username =  var.nextBoolean();
// short username =  var.nextShort();