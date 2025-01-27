package module2._01ifs;

import java.util.Scanner;
public class PizzaCalculatorInput {

    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza slices are there?");
        pizzaSlices = scan.nextInt();
        System.out.println("How many people are there?");
        numPeople = scan.nextInt();
        if (numPeople > 0) {
        	slicesPerPerson = pizzaSlices / numPeople;
            leftoverSlices = pizzaSlices % numPeople;
            System.out.println(slicesPerPerson);
            System.out.println(leftoverSlices);
        }
    }

}
