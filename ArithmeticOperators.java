public class ArithmeticOperators {

	public static void main(String[] args){

		int x = 2 * 5 + 3 * 4 - 8; 	// 14 multiplacative operators (*, /, %) have higher presidance than additive operators (+, -)

		System.out.println("x =\t\t" + x);

		int i = 2 * (8 * 4 - 8); 	// order of presidance overridden with parentheses

		System.out.println("i =\t\t" + i);

	}
}