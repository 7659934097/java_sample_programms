class Student 
{
	public String name;
	public char gender;
	public String stream;
	public int yop;
	public double tenth;

	public double inter;
	public double degree;
	public Student(String a,char b,String c,int d,double e,double f,double g)
	{
		name = a;
		gender = b;
		stream = c;
		yop = d;
		tenth = e;
		inter = f;
		degree = g;
	}
	public void printAllInfo()
	{
		System.out.println("student info");
		System.out.println("name    - "+name);
		System.out.println("gender  - "+gender);
		System.out.println("stream  - "+stream);

        System.out.println("yop     - "+yop);
        System.out.println("tenth   - "+tenth);
        System.out.println("inter   - "+inter);
        System.out.println("degree  - "+degree);
		System.out.println();
	}




	public static void main(String[] args) 
	{
		Student s1 = new Student("Praveen",'M',"ECE",2020,8.5,91.3,6.63);
		Student s2 = new Student("Venkatesh",'M',"ECE",2021,8.00,71.3,7.63);
		Student s3 = new Student("Kiran",'M',"ECE",2022,9.5,94.3,8.63);
		s1.printAllInfo();
		s2.printAllInfo();
		s3.printAllInfo();
	}
}
