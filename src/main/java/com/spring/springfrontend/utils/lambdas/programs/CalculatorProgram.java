package com.spring.springfrontend.utils.lambdas.programs;

import com.spring.springfrontend.utils.lambdas.CalculatorLambdaExamples;

import java.util.Scanner;

public class CalculatorProgram {

    private static Scanner input;
    private static float n1;
    private static String calculatorFunctionChoice;
    private static float n2;

    public static void main(String[] args) {

        CalculatorLambdaExamples calculatorLambdaExamples = new CalculatorLambdaExamples();
        input = new Scanner(System.in);

        while (calculatorFunctionChoice != "esc") {

            System.out.println("\nNumber 1: ");
            n1 = input.nextFloat();

            System.out.println("Choose calculator function from list (addition: +), (subtraction: -), (division: /), (multiplication: *), (isOdd: O), (isEven: E) (quit: esc): ");
            calculatorFunctionChoice = input.next();

            switch (calculatorFunctionChoice) {
                case ("+"):
                    System.out.println("Number 2: ");
                    n2 = input.nextFloat();

                    calculatorLambdaExamples.calculateAddition(n1, n2);
                    break;

                case ("-"):
                    System.out.println("Number 2: ");
                    n2 = input.nextFloat();

                    calculatorLambdaExamples.calculateSubtraction(n1, n2);
                    break;

                case ("/"):
                    System.out.println("Number 2: ");
                    n2 = input.nextFloat();

                    calculatorLambdaExamples.calculateDivision(n1, n2);
                    break;

                case ("*"):
                    System.out.println("Number 2: ");
                    n2 = input.nextFloat();

                    calculatorLambdaExamples.calculateMultiplication(n1, n2);
                    break;

                case ("O"):
                    calculatorLambdaExamples.isOdd(n1);
                    break;

                case ("E"):
                    calculatorLambdaExamples.isEven(n1);
                    break;

                default:
                    System.out.println("\nUnknown calculator function terminating program...");
                    System.exit(0);
                    break;
            }
        }
    }
}
