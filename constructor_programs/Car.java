class Car 
{
	public static String brand = "Audi";
	public String series;
	public String color;
	public int speed;
	public int time;
	public Car(String series,String color,int speed,int time)
	{
		this.series = series;
		this.color = color;
		this.speed = speed;
		this.time = time;
	}
	public void findDistance()
	{
		int distance = speed*time;
		System.out.println(color +" color "+brand+" series "+series+" moving @ the spped of "+speed+"km/h for "+time+"hours has covered a distance "+distance+"km");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Car c1 = new Car("A4","Red",240,2);
		Car c2 = new Car("A6","Blue",340,4);
		c1.findDistance();
		c2.findDistance();
	}
}
