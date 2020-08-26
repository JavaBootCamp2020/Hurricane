//Author Gil Silva
//Hurricane speed information
//Java bootcamp

import java.util.Scanner;

public class Hurricane {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       // System.out.println("Enter 0 to quit program.");
        System.out.println("Enter the hurricane speed (mph): ");
        int speed = input.nextInt();


        // if statement verifies the wind speed to classify hurricane category.
            if (speed >= 74 && speed <= 95) {
                System.out.println("This is a category 1 hurricane.");
            } else if (speed >= 95 && speed <= 110) {
                System.out.println("This is a category 2 hurricane.");
            } else if (speed >= 111 && speed <= 129) {
                System.out.println("This is a category 3 hurricane.");
            } else if (speed >= 130 && speed <= 156) {
                System.out.println("This is a category 4 hurricane.");
            } else if (speed >= 157) {
                System.out.println("This is a category 5 hurricane.");
            } else {
                System.out.println("This is not a hurricane. It's just windy.");
            }

    }
}
