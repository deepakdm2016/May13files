import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {
	
	public static void main(String v[])
	{
		Date date1 = new Date(2016, 11, 18); 
        Date date2 = new Date(1997, 10, 27);         
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		;
		System.out.println(date1);
		System.out.println(sdf.format(date1));
		
		
		Calendar cal=Calendar.getInstance();
		//cal.set(2019, 3, 27);
		Date time = cal.getTime();
		System.out.println(cal.getTime());
		System.out.println(sdf.format(time));
		

	}

}
