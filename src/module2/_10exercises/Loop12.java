package module2._10exercises;

public class Loop12
{
    public static void main(String[] args)
    {
        String message = "xyxxzax";
        int i = 0;
        int counter = 0;
        
        while (message.indexOf("x") >= 0)
        {
        	i = message.indexOf("x");
        	System.out.println("Position of x at index: " + i);
        	String firstPart = message.substring(0,i);
        	String lastPart = message.substring(i+1);
        	message = firstPart + "" + lastPart;
        	counter++;
        	
        }
        System.out.println("Number of x's: " + counter);
    }
}
