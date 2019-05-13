package HospitalUtils_testVargant;

import java.util.Date;

public class patient {
	
	public static int count=0;
	
	private String name;
	private String locality;
	private Date dateOfRegistration;

	
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}




	
	patient(String name, String place, Date d)
	{
		this.name=name;
		this.locality=place;
		System.out.println("Patient added "+ name + " "+place);
		this.dateOfRegistration=d;
	}
	
	
	public boolean isLocalite()
	{
		if (this.locality.equals("Bangalore")) return true;
				
		return false;
		
	}





	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
