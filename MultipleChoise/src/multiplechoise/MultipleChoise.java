package multiplechoise;

import java.util.Scanner;

public class MultipleChoise {
    public static void main(String[] args) {
        /* Objects */
        Scanner input = new Scanner(System.in);

        /* Variables */
        String question = "Of which color was the white horse of Napoleon?";
        String choiceOne = "White";
        String choiceTwo = "Gray";
        String choiceThree = "Black";
        String correctChoice = choiceTwo;
        int userChoice = 0;

        System.out.println(question + "\n"
                + choiceOne + " Press 1\n"
                + choiceTwo + " Press 2\n"
                + choiceThree + " Press 3\n");

        boolean hasError = true;
        while (hasError) {
            try {
                String Aux = input.nextLine();

                userChoice = Integer.valueOf(Aux);
                if (userChoice > 3 || userChoice < 1) {
                    int error = 5 / 0;
                }
                hasError = false;
            } catch (Exception e) {
                hasError = true;
                System.out.println("Please select a valid option");
            }
        }

        switch (userChoice) {
            case 1: {
                System.out.println("Error! The answer is not Correct.");
                break;
            }
            case 2: {
                System.out.println("Congrats! The answer is correct");
                break;
            }
            case 3: {
                System.out.println("Error! The answer is not Correct.");
                break;
            }
        }

    }
}

