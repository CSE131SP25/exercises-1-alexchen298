package module1._3expressions;

public class PizzaCalculator {

    public static void main(String[] args) {
        int pizzaSlices = 16, numPeople = 5, slicesPerPerson = pizzaSlices / numPeople, leftoverSlices = pizzaSlices % numPeople;
        System.out.println("Slices per person = " + slicesPerPerson);
        System.out.println("Leftover slices = " + leftoverSlices);
    }

}
