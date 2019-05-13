import java.util.Calendar;
public class LeapYear {
	
	public static void main(String v[])
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, 1999);
		int maxDay=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(maxDay);
		
		if(maxDay==366)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not");
	}

}
