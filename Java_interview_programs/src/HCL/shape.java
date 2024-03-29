package HCL;

public  class shape {
	
	private double length;
	private double breadth;
	
	shape(double length)
	{
		this.length=length;
	}
	
	shape(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double Area( double length)
	{
		return 3.14*length*length;
	}

	public double Area( double length, double breadth)
	{
		return length*breadth;
	}
}
