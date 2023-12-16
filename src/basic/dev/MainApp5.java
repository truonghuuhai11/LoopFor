package basic.dev;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i <= 999; i++) {
			int n = i;
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			if (sum % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}