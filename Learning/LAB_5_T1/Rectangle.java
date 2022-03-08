package LAB_5_T1;

public class Rectangle {
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
