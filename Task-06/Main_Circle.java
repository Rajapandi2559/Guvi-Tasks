package task_6;

public class Main_Circle {

	public static void main(String[] args) {
		
		int r=5;
		
		Circle circle = new Circle(r);
		System.out.println("Radius of the circle is " + r);
		System.out.println("The circumference of the circle is " + circle.getCircumference());
		
		r=10;
		circle.setRadius(r);
		System.out.println("\nRadius of the circle is " + r);
		System.out.println("The circumference of the circle is now " + circle.getCircumference());
	}
}
