class AreaOfCircle 
{
	public int r;
	public double pi;
	public AreaOfCircle(int a,double b)
	{
		this.r=a;
		this.pi=b;
	}
	public void printArea()
	{
		double area=pi*r*r;
		System.out.println("AreaOfCircle is:"+area);
	}
	public static void main(String[] args)
	{
		AreaOfCircle a1= new AreaOfCircle(2,3.14);
		a1.printArea();
	}
}
