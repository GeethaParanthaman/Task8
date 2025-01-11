package JatTask6;

public class Circle {
	private double radius;
	
	public Circle()
	{
		this.radius=0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circleObj1=new Circle();
		System.out.println("Circle with no arguments");
		System.out.println("Radius: "+circleObj1.circumferenceCalculation());
		
		Circle circleObj2=new Circle(10);
		System.out.println("Circel with arguments");
		System.out.println("Radius:"+circleObj2.circumferenceCalculation());

	}
	public double circumferenceCalculation()
	{
		return 2*Math.PI*radius;
	}

}
