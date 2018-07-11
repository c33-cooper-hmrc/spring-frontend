package com.spring.springfrontend.utils.lambdaExamples.models;

import com.spring.springfrontend.utils.lambdaExamples.functionalInterfaces.Calculator;
import com.spring.springfrontend.utils.lambdaExamples.functionalInterfaces.OddOrEven;

public class CalculatorLambdaExamples {

    // Calculator functional interfaces
    Calculator sumCalculation;
    Calculator subtractCalculation;
    Calculator divisionCalculation;
    Calculator multiplicationCalculation;

    // OddOrEven functional interfaces
    OddOrEven isOdd;
    OddOrEven isEven;

    // Class constructor
    public CalculatorLambdaExamples() {
        this.sumCalculation = (n1, n2) -> n1 + n2;
        this.subtractCalculation = (n1, n2) -> n1 - n2;
        this.divisionCalculation = (n1, n2) -> n1 / n2;
        this.multiplicationCalculation = (n1, n2) -> n1 * n2;

        this.isOdd = (n) -> n % 2 != 0;
        this.isEven = (n) -> n % 2 == 0;
    }

    // Calculate function
    public float calculate(Calculator calculator, float n1, float n2) {
        return calculator.apply(n1, n2);
    }

    // Odd or even function
    public boolean oddOrEven(OddOrEven oddOrEven, float n) {
        return oddOrEven.apply(n);
    }

    // CALCULATE FUNCTION variations
    public void calculateAddition(float n1, float n2) {
        System.out.println(n1 + " + " + n2  + " = " + calculate(this.sumCalculation, n1, n2));
    }

    public void calculateSubtraction(float n1, float n2) {
        System.out.println(n1 + " - " + n2 + " = " + calculate(this.subtractCalculation, n1, n2));
    }

    public void calculateDivision(float n1, float n2) {
        System.out.println(n1 + " / " + n2 + " = " + calculate(this.divisionCalculation, n1, n2));
    }

    public void calculateMultiplication(float n1, float n2) {
        System.out.println(n1 + " * " + n2 + " = " + calculate(this.multiplicationCalculation, n1, n2));
    }

    // ODD OR EVEN FUNCTION variations
    public void isOdd(float n) {
        System.out.println("Is " + n + " an odd number: " + oddOrEven(this.isOdd, n));
    }

    public void isEven(float n) {
        System.out.println("Is " + n + " an even number: " + oddOrEven(this.isEven, n));
    }
}
