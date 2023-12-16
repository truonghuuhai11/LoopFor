package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào một số tự nhiên n: ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("Tổng các số chia hết cho 3 và bé hơn " + n + " là: " + sum);
	}
}