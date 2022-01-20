package ie.itcarlow.lab2b;

public class Rectangle {

	private double Lenght;
	private double Width;
	private double Area;
	private double Perimeter;
	public Rectangle() {
		Lenght = 1;
		Width = 1;
	}

	public double getLenght() {
		return Lenght;
	}
	public void setLenght(double newLenght) {
		if(Lenght >= 0.0 && Lenght <= 40.0) {
			Lenght = newLenght;
		}else { System.out.println("Value is less than 0.0 or larger than 40.0");

		}
	}
	public double getWidth() {

		return Width;
	}
	public void setWidth(double newWidth) {

		if(Width > 0.0 && Width < 40.0) {
			Width = newWidth;
		}else { System.out.println("Value is less than 0.0 or larger than 40.0");

		}

	}
	public void toString () {
		System.out.println("Lenght =" + Lenght);
		System.out.println("Width = " + Width);
	}

	public double getArea() {
		Area = Lenght*Width;
		return Area;
	}
	public double getPerimeter() {
		Perimeter = Lenght + Lenght + Width +Width;
		return Perimeter;
	}
	public void printRectangle() {
		for (int i = 0; i <= Lenght; i++ ){
			for (int j = 0; j <= Width; j++){
				if (i == 0 || j == 0 || i == Lenght || j == Width) {
					System.out.print("*")
				}
				else{
					System.out.print(" ")
				}
			}
			System.out.println();
		}
	}
}
