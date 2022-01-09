package week3.day1;

public class Calculator {

	public void add(int a, int b, int c) {
		System.out.println("Sum:" + a + b + c);
	}

	public void add1(int d, int e, int f) {

		System.out.println("Sum:" +d + e + f);
	}

	public void mul(int a1, int a2) {
		System.out.println("Mul:" + a1 * a2);
	}

	public void mul1(int a3, double a4) {
		System.out.println("Mul:" + a3 * a4);
	}

	public void sub(int b1, int b2) {
		System.out.println("Sub :" +( b1 - b2));
	}

	public void sub1(int b3, double b4) {
		System.out.println("Sub :" + (b3 - b4));
	}

	public void div(int d1, int d2) {
		System.out.println("Div :" + d1 / d2);
	}

	public void div1(int d3, int d4) {
		System.out.println("Div :" + d3 / d4);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		calc.add(2, 3, 4);
		calc.add1(1, 2, 3);
		calc.mul(2, 4);
		calc.mul1(2, 2.5);
		calc.sub(6, 2);
		calc.sub1(8, 4);
		calc.div(8, 4);
		calc.div1(10, 2);
	}

}
