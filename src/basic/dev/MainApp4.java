package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào một số nguyên n: ");
		int n = sc.nextInt();

		if (kiemTraPolinom(n)) {
			System.out.println(n + " là số polinom.");
		} else {
			System.out.println(n + " không là số polinom.");
		}
	}

	public static boolean kiemTraPolinom(int n) {
		int soBanDau = n;
		int soDaoNguoc = 0;

		for (; n > 0; n /= 10) {
			int chuso = n % 10;
			soDaoNguoc = soDaoNguoc * 10 + chuso;
		}

		return soBanDau == soDaoNguoc;
	}
}