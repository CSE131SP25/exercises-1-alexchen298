package module1._3expressions;

import java.util.Scanner;
public class PizzaCalculatorInput {

    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many slices of pizza?");
        pizzaSlices = scan.nextInt();
        System.out.println("How many people are there?");
        numPeople = scan.nextInt();
        //add code to initialize pizzaSlices and numPeople from user input 
        
        slicesPerPerson = pizzaSlices / numPeople;
        leftoverSlices = pizzaSlices % numPeople;
        System.out.println("Slices per person = " + slicesPerPerson);
        System.out.println("Leftover slices = " + leftoverSlices);
        //add code to compute and print slicesPerPerson and leftoverSlices
       

    }

}
