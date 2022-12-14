package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3,5);
		System.out.println(p.toString());
		Point p1 = new Point(3,5);
		
		Line l = new Line(new Point(5,6),new Point(8,9));
		Line l1 = new Line(new Point(5,6),new Point(8,9));
		System.out.println(l.toString());
		
		Circle c = new Circle (new Point(5,6) , 6);
		System.out.println(c.toString());
		
		Rectangle rc = new Rectangle (new Point(5,6) , 5 , 4);
		System.out.println(rc.toString());
		
		System.out.println(p.equals(p1));
		System.out.println(l.equals(l1));
		
		Donut d1 = new Donut(p,4,2);
		Donut d2 = new Donut(new Point(3,5),4,2);
		
		System.out.println(d1.equals(d2));
	}
}
