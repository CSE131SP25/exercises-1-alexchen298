package module3._1basics;

public class Array3
{
   public static void main(String[] args)
   {
     // declare and create arrays
     int[ ] highScores = new int[6];
     // Print initial highScore
     System.out.println(highScores[0]);
     // put values in highScore using an indexed variable
     highScores[0] = 97;
     highScores[1] = 98;
     highScores[2] = 98;
     highScores[3] = 88;
     highScores[4] = 68;
     highScores[5] = 100;

     // Print first highScore at index 0
     System.out.println( highScores[5]);

   }
}

