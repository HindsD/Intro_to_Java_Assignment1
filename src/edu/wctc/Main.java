package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] questions = {"Do you prefer Mild or Spicy?", "Do you prefer Tea or Coffee?",
                "Do you prefer Breakfast or Brunch?", "Do you prefer Summer or Winter?",
                "Do you prefer Paper or Plastic?"};

        int[] arr = new int[5];
        System.out.println("Welcome to the Preference Quiz!");
        System.out.println("------------------");

        boolean repeat = false;
        while (!repeat) {


            for (int i = 0; i < 5; i++) {
                System.out.println(questions[i]);
                System.out.println("Enter 0 for the preference on the left");
                System.out.println("Enter 1 for the preference on the right");
                Scanner response = new Scanner(System.in);
                arr[i] = response.nextInt();

            }
            int mySum = sum(arr);
            System.out.println("Your score: "+ mySum);

            if (mySum < 3){
                System.out.println("You prefer life to be calm and organized");
            }
            else if (mySum == 3){
                System.out.println("You prefer a good balance in life.");
            }
            else if (mySum > 3){
                System.out.println("You prefer life to be spontaneous and active");
            }
            System.out.println("----------------------");


            System.out.println("Run the program again? 1 for yes, 2 for no");
            int again = Integer.parseInt(keyboard.nextLine());
            if (again == 1){
            }
            else if (again == 2){
                repeat = true;
            }

        }
        System.out.println("Thanks for taking the Quiz!");

    }
    public static int sum(int[] arr){
        //int[] arr = new int[5];
        int sum = 0;
        for(int i =0;i<arr.length;i++)
            sum +=arr[i];
        return sum;
    }


}

