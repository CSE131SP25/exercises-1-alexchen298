package module2._03elseif;

public class BatteryTest
{
    public static void main(String[] args)
    {
        int battery = 101;
        if (battery < 50) 
        {
        	System.out.println("Plug in your phone!");
        }
        else if (battery > 100)
        {
        	System.out.println("Unplug your phone!");
        }
        else 
        {
        System.out.println("All okay!");
        }
    }
}
