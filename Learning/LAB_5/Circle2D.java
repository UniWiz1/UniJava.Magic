package LAB_5;

public class Circle2D {
		double x;
		double y;
		double radius;
		
		double getX () {
			return x;
		}
		
		double getY () {
			return y;
		}
		
		double getRadius () {
			return radius;
		}
		
		
		Circle2D () {
			x=0;
			y=0;
			radius=1;
		}
		
		Circle2D (double newX, double newY, double newRadius){
			x = newX;
			y = newY;
			radius = newRadius;
			
		}
		
		double getArea () {
			double area = radius*radius*Math.PI;
			return area;
		}
		
		double getPerimeter () {
			double Perimeter = 2*radius*Math.PI;
			return Perimeter;
		}
	}
