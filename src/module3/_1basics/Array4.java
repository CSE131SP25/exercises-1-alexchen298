package module3._1basics;

public class Array4
{
   public static void main(String[] args)
   {
     // declare, create, initialize arrays
     int[ ] highScores = {99,97,98,88,68,95};
     String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia", "Alex" };
     // Print corresponding names and scores
     System.out.println(names[3] + " has a score of " + highScores[3]);
     System.out.println(names[1] + " has a score of " + highScores[1]);
   }
}

