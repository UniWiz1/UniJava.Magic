package LAB_5_T1;

class Rectangle {
	double width = 1;
	double height = 1;
	
	Rectangle () {}
	
	Rectangle (double newHeight, double newWidth){
		width = newWidth;
		height = newHeight;
		
	}
	
	double getArea () {
		double area = height*width;
		return area;
	}
	
	double getPerimeter () {
		double Perimeter = 2*height + 2*width;
		return Perimeter;
	}
}

public class main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (40, 4);
		Rectangle r2 = new Rectangle (35.9, 3.5);
		
		System.out.print("Rectangle 1: "+r1.width+" ");
		System.out.print(r1.height+" ");
		System.out.print(r1.getArea()+" ");
		System.out.println(r1.getPerimeter());
		System.out.print("Rectangle 2: "+r2.width+" ");
		System.out.print(r2.height+" ");
		System.out.print(r2.getArea()+" ");
		System.out.print(r2.getPerimeter());
	}

}
