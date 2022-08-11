//Number 1//

public class Calculator {
	
	  static int add(int num1, int num2) {
			return num1 + num2;
		}
	 
	 static int subtract(int num1, int num2) {
		 return num1-num2;
	 }
	 
	  static int multiplication(int num1, int num2) {
		 return num1* num2;
	 }
	 
	 static int division(int num1, int num2) {
		 return num1/num2;
	 }
	 
	 static int square(int num) {
		 return num * num;
	 }

	public static void main(String[] args) {
		
		System.out.println(add(24, 10));
		System.out.println(subtract(90, 50));
		System.out.println(multiplication (9, 7));
		System.out.println(division(20,4));
		System.out.println(square(9));
		
		 

	}

}


//Number 2//

public class MagicCalculator {

	public static void main(String[] args) {
		
		double z = 180;
		double x = 10;
		double y = Math.toRadians(x);
		x = Math.toRadians(x);
		y = Math.toRadians(y);
		
		
		
		System.out.print((Math.sqrt(x)));
		System.out.print((Math.sin(x)));
		System.out.print((Math.cos(y)));
		System.out.print((Math.tan(y)));
		System.out.print((Math.!(x)))

	}

}
