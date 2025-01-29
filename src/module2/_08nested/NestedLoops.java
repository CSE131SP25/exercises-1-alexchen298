package module2._08nested;

public class NestedLoops
{

   public static void main(String[] args)
   {
       for (int row = 1; row <= 10; row++)
       {
           for (int col = 1; col <= 8; col++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

