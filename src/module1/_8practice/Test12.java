package module1._8practice;

public class Test12
{
    public static void main(String[] args)
    {
    	int secondsInMinute = 60; 
    	int minutesInHour = 60; 
    	int hoursInDay = 24;
    	int secondsInDay = secondsInMinute * minutesInHour * hoursInDay;
    	double secondsInThreeDays = (double) 3 * secondsInDay;
    	System.out.println(secondsInThreeDays);
       // Your code should use the variables
       // secondsInDay and secondsInThreeDays
       // and print out secondsInThreeDays

    }
}
