package com.example.operator;

public class Application {

    /**
     * http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
     */
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        result ++;
        System.out.println("Result is now " + result);

        result --;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);

        result *=10;
        System.out.println("Result is now " + result);

        result -=10;
        System.out.println("Result is now " + result);

        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greather than secondTopScore and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = true;
        if (isCar == true)
            System.out.println("This is true");
        if (isCar)
            System.out.println("This is true");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");


        // 1. Create a double bariable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25.
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        // if the reamining total (#4) is equal to 20 or less.
        double firstValue = 20d;
        double secondtValue = 80d;
        double totalValue = (firstValue + secondtValue) * 25;
        System.out.println("3. => " + totalValue);
        double remainder = totalValue % 40;
        System.out.println(remainder);
        if(remainder <= 20 )
            System.out.println("Total was over the limit");



    }
}
