class Demo 
{
	public Demo(int a)
	{
		System.out.println("inside constructor with int arg a : "+a);
	}
	public static void main(String[] args) 
	{
		Demo d1 = new Demo(1);
		Demo d2 = new Demo(2);
		Demo d3 = new Demo(3);
		Demo d4 = new Demo(4);
	
	}
}
