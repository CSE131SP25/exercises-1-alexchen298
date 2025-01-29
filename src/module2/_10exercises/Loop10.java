package module2._10exercises;

public class Loop10
{
    public static void main(String[] args)
    {
           String message = "help";
           String ithCharacter;
           for (int i = 4; i >= 0; i--)
           {
        	 ithCharacter = message.substring(0,i);
        	 System.out.println(ithCharacter);
        	   
           }
          
    }
}
