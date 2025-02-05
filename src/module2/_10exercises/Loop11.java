package module2._10exercises;

public class Loop11
{
    public static void main(String[] args)
    {
        String message = "Ix lovex youxxx";
        int i = 0;
        
        while (message.indexOf("x") >= 0)
        {
        	i = message.indexOf("x");
        	System.out.println("Found an x at index: " + i);
        	String firstpart = message.substring(0,i);
            String lastpart = message.substring(i+1);
            message = firstpart + "" + lastpart;
            System.out.println("Removed x at in"
            		+ "dex " + i);
        }
        System.out.println(message);


    }
}
