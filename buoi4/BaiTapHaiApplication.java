package baitapvenha;

import java.util.Scanner;

public class BaiTapHaiApplication {
	public static void main(String[] args) {
		System.out.println("Viết chương trình tính giai thừa của số được người dùng nhập vào");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a < 0) {
			System.out.println("số a phải lớn  0");
		} else {
			if (a == 0 || a == 1) {
				System.out.println("giai thừa của " + a + " là  1");
			} else {
				long x = 1;
				for (int i = 2; i <= a; i++) {
					x = x * i;
				}
				System.out.println("giai thừa của " + a + " là  " + x);
			}
		}

	}
}
