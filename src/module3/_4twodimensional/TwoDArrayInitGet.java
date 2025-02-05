package module3._4twodimensional;

public class TwoDArrayInitGet
{
   public static void main(String[] args)
   {
      String[][] seatingInfo = { {"Jamal", "Maria"},
                                 {"Jake", "Suzy"},
                                 {"Emma", "Luke"},
                                 {"Alexander", "Cheddy"},
                                 };
      String name = seatingInfo[3][1];
      System.out.println(name + " is at [3,1]");

   }
}

