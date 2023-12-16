package basic.dev;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int a = 0, b = 1;

		System.out.println("100 số Fibonacci đầu tiên:");

		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");

			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}